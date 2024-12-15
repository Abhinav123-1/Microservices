package com.aspq.hotel.service.service;

import com.aspq.hotel.service.entity.Hotel;

import java.util.List;

public interface HotelService {

    //Create
    Hotel createHotel(Hotel hotel);

    //Get
    Hotel getOneHotel(String id);

    //Get All
     List<Hotel> getAllHotels();




}
