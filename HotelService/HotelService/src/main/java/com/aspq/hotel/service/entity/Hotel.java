package com.aspq.hotel.service.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="hotel")
public class Hotel {
    @Id
    @Column(name="hotel_id")
    private String hotelID;
    @Column(name="hotel_name")
    private String hotelName;
    @Column(name="hotel_address")
    private String hotelAddress;
    @Column(name="about")
    private String about;
}

