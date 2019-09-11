package carRental.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import carRental.model.CarsList;
import carRental.model.Rental;
import carRental.repository.CarsRepository;

@Service
public class CarsService implements ICarsService{
	
	@Autowired
	private CarsRepository carsRepository;
	
	private CarsList _cars;
	
	private static CarsService carsService = new CarsService();

	public static CarsService getInstance() {
		return carsService;
	}
	
	public List<CarsList> findAll() {
		List<CarsList> cars = (List<CarsList>) carsRepository.findAll();
		return cars;
	}
	
	public CarsList findById(int id) {
		CarsList car = carsRepository.findById(id).get();
		return car;
	}
	
	public String update(int id, CarsList cars) {
		for (CarsList car : carsRepository.findAll()) {
			if (car.getId() == id) {
				CarsList carsList = (CarsList) cars;
				carsList.setId(id);
				carsRepository.save(carsList);
			}
		}
		return "Updated";
	}
	
	public String addCar(CarsList car) {
		carsRepository.save(car);
		return "Added";
	}
	
	public String deleteAll() {
		carsRepository.deleteAll();
		return "(All) Deleted";
	}
	
	public String deleteCars(int id) {
		for (CarsList car: carsRepository.findAll()) {
			if (car.getId() == id) {
				carsRepository.deleteById(id);
			}
		}
		return "Deleted";
	}
	
	public Rental rentCar(int id, int time) {
		for (CarsList car : carsRepository.findAll()) {
			if (car.getId() == id) {
				_cars = car;
			}
		}
		return new Rental(_cars.getId(), _cars.getCar_name(), _cars.getRental_price(), time, _cars.getRental_price()*time);
	}
}
