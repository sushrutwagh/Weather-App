package com.deloitte.fi.forecast.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.deloitte.fi.forecast.model.Weather;
import com.deloitte.fi.forecast.repository.WeatherForecastRepository;

@Service
public class WeatherForecastService {
	
	@Autowired
	WeatherForecastRepository forecastRepository;
	
	public Iterable<Weather> getWeatherByDateRange(String cityName,String fromdate,String todate) {

			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			fromdate = fromdate.substring(0, 10);
			todate = todate.substring(0, 10);
			LocalDate dd1 = LocalDate.parse(fromdate, formatter);
			LocalDate dd2 = LocalDate.parse(todate, formatter);
			return forecastRepository.findByCityNameAndDateRange(cityName,dd1,dd2);
	}
	
	
}
