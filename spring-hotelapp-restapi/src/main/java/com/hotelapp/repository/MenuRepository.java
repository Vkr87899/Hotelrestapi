package com.hotelapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotelapp.models.Hotel;
import com.hotelapp.models.Menu;

@Repository
public interface MenuRepository extends JpaRepository< Menu, Integer>{
	
//	Derived Queries
	List<Menu> findByHotelName(String hotelName);
		
	}


