package com.hotelapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hotelapp.models.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Integer>{
	
	List<Hotel> findByAddressCity(String city);
	List<Hotel> findByAddressStreetName(String location);
    @Query("FRom Hotel h inner join h.menuList mn Where mn.menuName=?1")
	List<Hotel> getHotelsByMenu(String menuName);
    
    @Query("From Hotel h inner join h.delivery mn Where mn.partnerName=?1")
    List<Hotel> getHotelsByDelivery(String partnerName);
    
    @Query("From Hotel h inner join h.address  inner join h.menuList mn Where a.streetName=?1 AND mn.menuName=?2")
    List<Hotel>getHotelsByLocationAndMenu(String location, String menuName);
}
