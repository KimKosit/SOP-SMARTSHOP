package carRental.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import carRental.model.Rental;
import carRental.model.CarsList;
import carRental.service.ICarsService;

@RestController
@Controller
public class CarsController {
	
	@Autowired
    private ICarsService carsService;
    
    @RequestMapping("/")
    String home() {
    	return "<b>Welcome to KimKho Car Rental!</b>"
    			+ "<br><br>To view all model please <b>GET</b> to \"http://localhost:port/carslist/\""
    			+ "<br><br>To view more detail about the model you want please <b>GET</b> to \"http://localhost:port/carslist/id/\""
    			+ "<br><br>To rent a car please <b>POST</b> to \"http://localhost:port/rental/\" with value of body like below."
    			+ "<br><br>{"
    			+ "<br>\"id\": Car ID"
    			+ "<br>\"time\": Amount of time in hours"
    			+ "<br>}"
    			+ "<br><br>To add new car please <b>POST</b> to \"http://localhost:port/addCar/\" with value of body like below."
    			+ "<br><br>{"
    			+ "<br>\"id\": Car ID"
    			+ "<br>\"car_name\": Amount of time in hours"
    			+ "<br>\"car_type\": Type of car"
    			+ "<br>\"car_picture\": Link of car's picture"
    			+ "<br>\"car_spec\": Specification of car"
    			+ "<br>\"rental_price\": Rental price/Hour"
    			+ "<br>}"
    			+"<br><br>To update car information please <b>PUT</b> to \"http://localhost:port/update/{id}/\" with value of body like below."
    			+ "<br><br>{"
    			+ "<br>\"id\": Car ID"
    			+ "<br>\"car_name\": Amount of time in hours"
    			+ "<br>\"car_type\": Type of car"
    			+ "<br>\"car_picture\": Link of car's picture"
    			+ "<br>\"car_spec\": Specification of car"
    			+ "<br>\"rental_price\": Rental price/Hour"
    			+ "<br>}"
    			+ "<br><br>To delete some car please <b>DELETE</b> to \"http://localhost:port/delete/{id}/\""
    			+ "<br><br>To delete all car please <b>DELETE></b> to \"http://localhost:port/deleteAll/\"";
    }
    
    @RequestMapping(value = "/carslist", method = RequestMethod.GET)
    public List<CarsList> getAll() {
    	List<CarsList> cars = (List<CarsList>) carsService.findAll();
		return cars;
    }
    
    @RequestMapping(value = "/carslist/{id}", method = RequestMethod.GET)
    public CarsList getCars_list(@PathVariable int id) {
    	CarsList car = carsService.findById(id);
    	return car;
    }
    
    @RequestMapping(value = "/rental", method = RequestMethod.POST)
    public Rental rentCar(@RequestBody Rental rental) {
    	return carsService.rentCar(rental.getId(), rental.getTime());
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    public String updateCar(@PathVariable int id, @RequestBody CarsList cars) {
    	return carsService.update(id, cars);
    }
    
    @RequestMapping(value="/addCar", method=RequestMethod.POST)
    public String addCar(@RequestBody CarsList car) {
    	return carsService.addCar(car);
    }
    
    @RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
    public String delete(@PathVariable int id) {
    	return carsService.deleteCars(id);
    }
    
    @RequestMapping(value="/delete", method=RequestMethod.DELETE)
    public String deleteAll() {
    	return carsService.deleteAll();
    }
}
