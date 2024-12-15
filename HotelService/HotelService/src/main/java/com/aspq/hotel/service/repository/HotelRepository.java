package com.aspq.hotel.service.repository;

import com.aspq.hotel.service.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, String> {

    Hotel getHotelByHotelID(String hotelID);
}
