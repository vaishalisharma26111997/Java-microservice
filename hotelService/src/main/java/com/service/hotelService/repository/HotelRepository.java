package com.service.hotelService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.service.hotelService.entities.Hotel;
public interface HotelRepository extends JpaRepository<Hotel,String> {

}
