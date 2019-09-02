package carRental;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */

@EnableAutoConfiguration
@SpringBootApplication
@RestController
public class CarRentalApp 
{
    public static void main( String[] args )
    {
        SpringApplication.run(CarRentalApp.class, args);
    }
    
    @RequestMapping("/")
    String home() {
    	return "<b>Welcome to KimKho Car Rental!</b>"
    			+ "<br>To view all model please go to \"localhost:port/carslist/\""
    			+ "<br>To view more detail about the model you want please go to \"localhost:port/carslist/id/\""
    			+ "<br>To rent a car please go to \"localhost:port/rental\"";
    }
    
    @RequestMapping("/carslist")
    CarsList[] cars_list() {
    	return CarsListFactory.getAllCars_list();
    }
    
    @RequestMapping(value = "/carslist/{id}", method = RequestMethod.GET)
    CarsList getCars_list(@PathVariable int id) {
		return CarsListFactory.getCars_list(id);
    }
    
    
    
}
