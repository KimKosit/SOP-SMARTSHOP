package carRental.service;

import carRental.model.CarsList;

public class CarsFactory {
	
	public static CarsList create(String car_type) {
		if (car_type.equals("Sports")) {
			return new CarsList(car_type = "Sports");
		}
		else if (car_type.equals("Roadster")) {
			return new CarsList(car_type = "Roadster");
		}
		else if (car_type.equals("Supercar")) {
			return new CarsList(car_type = "Supercar");
		}
		return null;
	}
	
}
