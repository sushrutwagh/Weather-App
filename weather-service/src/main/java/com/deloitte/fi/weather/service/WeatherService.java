package com.deloitte.fi.weather.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.deloitte.fi.weather.model.Weather;
import com.deloitte.fi.weather.repository.WeatherRepository;

@Service
public class WeatherService {

	@Autowired
	WeatherRepository weatherRepository;
	
	public Iterable<Weather> getAllWeatherDetails() {

			return weatherRepository.findAll();
	}
	
	public Iterable<Weather> getWeatherByCityAndDate(String cityName, String date) {

			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			date = date.substring(0, 10);
			LocalDate dd = LocalDate.parse(date, formatter);
			return weatherRepository.findByCityNameAndDate(cityName,dd);
	}
	
	public Iterable<Weather> insertMultipleDetails(Iterable<Weather> weather) {
		return weatherRepository.saveAll(weather);	
	}
	
}
