package com.cenfotec.graphql.mutation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cenfotec.graphql.entities.Vehicle;
import com.cenfotec.graphql.services.VehicleServiceImpl;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;

@Component
public class VehicleMutation implements GraphQLMutationResolver {
	
	@Autowired
	private VehicleServiceImpl vehicleService;

	public Vehicle createVehicle(String type, String modelCode, String brandName,
	String launchDate) {
	 return this.vehicleService.createVehicle(type, modelCode,
	brandName, launchDate);
	}
}
