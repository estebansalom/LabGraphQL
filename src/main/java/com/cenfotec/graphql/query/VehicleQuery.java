package com.cenfotec.graphql.query;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cenfotec.graphql.entities.Vehicle;
import com.cenfotec.graphql.services.VehicleServiceImpl;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class VehicleQuery implements GraphQLQueryResolver {
	@Autowired
	 private VehicleServiceImpl vehicleService;
	
	 public List<Vehicle> getVehicles(int count) {
	 return this.vehicleService.getAllVehicles(count);
	 }
	 
	 public Optional<Vehicle> getVehicle(int id) {
	 return this.vehicleService.getVehicle(id);
	 }
}
