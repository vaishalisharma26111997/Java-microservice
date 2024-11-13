package com.service.hotelService.service;

import com.service.hotelService.entities.Hotel;
import com.service.hotelService.exception.ResourceNotFoundException;
import com.service.hotelService.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.rmi.server.UID;
import java.util.List;
import java.util.UUID;

@Service
public class HotelImp implements HotelService
{   @Autowired
    private HotelRepository hotelRepository;
    @Override
    public Hotel create(Hotel hotel) {
        String id= UUID.randomUUID().toString();
        hotel.setId(id);
      return  hotelRepository.save(hotel) ;
    }

    @Override
    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel getHotel(String id) {
        return hotelRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Resource not found"));
    }
}
