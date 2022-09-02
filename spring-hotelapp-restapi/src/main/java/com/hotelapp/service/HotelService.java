package com.hotelapp.service;

import java.util.List;

import com.hotelapp.models.Hotel;

public interface HotelService {
	
	void addHotel(Hotel hotel);
	void updateHotel(Hotel hotel);
	Hotel getHotelById(int hotelId);
	void deleteHotel(int hotelId);
	
	
	List<Hotel> getHotelsByCity(String city);
	List<Hotel> getHotelsByMenu(String menuName);
	List<Hotel> getHotelsByDelivery(String PartnerName);
	List<Hotel> getHotelsByLocation(String location);
	List<Hotel> getHotelsByLocationAndMenu(String location,String menuName);
	
	
}
