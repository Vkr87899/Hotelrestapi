package com.hotelapp.service;

import com.hotelapp.models.Delivery;
import com.hotelapp.models.Hotel;

public interface DeliveryService {
    
	void updateDelivery(Delivery delivery);
	void deleteDelivery(int deliveryId);
	Delivery getDeliveryById(int deliveryId);
	Delivery getDeliveryByPartner(String partnerName);
	
	
}
