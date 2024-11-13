package com.service.hotelService.service;

import com.service.hotelService.entities.Hotel;
import java.util.List;
public interface HotelService {

    public Hotel create(Hotel hotel);
    public List<Hotel>getAllHotels();
    public Hotel getHotel(String id);
}
