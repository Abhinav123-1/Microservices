package com.aspq.hotel.service.service.serviceimpl;

import com.aspq.hotel.service.entity.Hotel;
import com.aspq.hotel.service.exception.ResourceNotFoundException;
import com.aspq.hotel.service.repository.HotelRepository;
import com.aspq.hotel.service.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public Hotel createHotel(Hotel hotel) {
        String hotelID = UUID.randomUUID().toString();
        hotel.setHotelID(hotelID);
        return hotelRepository.save(hotel);
    }

    @Override
    public Hotel getOneHotel(String ID) {
        return hotelRepository.findById(ID).orElseThrow(() -> new ResourceNotFoundException("Hotel Against that ID does not exist!!! "));
    }

    @Override
    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }
}
