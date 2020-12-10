package com.cenfotec.graphql.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cenfotec.graphql.entities.Vehicle;

@Service
public interface VehicleService {
	public List<Vehicle> getAllVehicles(int count);
	public Optional<Vehicle> getVehicle(int id);
	public Vehicle createVehicle(String type, String modelCode,
			 String brandName, final String launchDate);
}
