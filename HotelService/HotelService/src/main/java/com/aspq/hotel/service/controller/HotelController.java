package com.aspq.hotel.service.controller;

import com.aspq.hotel.service.entity.Hotel;
import com.aspq.hotel.service.service.HotelService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/hotels")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @PostMapping
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel) {
        return ResponseEntity.ok(hotelService.createHotel(hotel));
    }

    @GetMapping("/{hotelID}")
    public ResponseEntity<Hotel> createHotel(@PathVariable String hotelID) {
        return ResponseEntity.ok(hotelService.getOneHotel(hotelID));
    }

    public ResponseEntity<List<Hotel>> getAllHotels() {
        return ResponseEntity.ok(hotelService.getAllHotels());
    }
    
}
