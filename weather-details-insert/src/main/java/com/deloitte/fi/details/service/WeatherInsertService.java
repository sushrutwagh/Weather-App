package com.deloitte.fi.details.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.fi.details.model.Weather;
import com.deloitte.fi.details.repository.WeatherInsertRepository;

@Service
public class WeatherInsertService {	
	@Autowired
	WeatherInsertRepository insertRepository;
	public Weather insertDetails(Weather weather) {
			return insertRepository.save(weather);
	}
}
