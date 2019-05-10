package com.example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Car;
import com.example.domain.CarRepository;

@RestController
public class CarController {
	@Autowired
	public CarRepository carRepository;
	
	@RequestMapping("/cars")
	public Iterable<Car> getCars() {
		return carRepository.findAll();
	}
}
