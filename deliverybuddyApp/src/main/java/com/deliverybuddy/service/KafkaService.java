package com.deliverybuddy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.deliverybuddy.config.AppConstants;

@Service
public class KafkaService {
	
	@Autowired
	private KafkaTemplate<String,String> kafkaTemplate; 
	
	public boolean updateLocation(String location)
	{
		this.kafkaTemplate.send(AppConstants.Location_Topic_Name,location);
		return true;
		
	}

}
