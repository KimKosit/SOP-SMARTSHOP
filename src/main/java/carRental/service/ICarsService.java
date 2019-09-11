package carRental.service;

import java.util.List;

import carRental.model.CarsList;
import carRental.model.Rental;

public interface ICarsService {
	public List<CarsList> findAll();
	public CarsList findById(int id);
	public String update(int id, CarsList cars);
	public String addCar(CarsList car);
	public String deleteAll();
	public String deleteCars(int id);
	public Rental rentCar(int id, int time);
}
