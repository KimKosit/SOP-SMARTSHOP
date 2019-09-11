package carRental.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "carslist")
public class CarsList {
	
	@Id
	private int id;
	private String car_picture;
	private String car_name;
	private String car_type;
	private String car_spec;
	private int rental_price;
	
	public CarsList() {super();}
	
	public CarsList(String car_type) {
		super();
		this.car_type = car_type;
	}
	
	public CarsList(int id,String car_picture, String car_name, String car_type, String car_spec, int rental_price) {
		super();
		this.id = id;
		this.car_picture = car_picture;
		this.car_name = car_name;
		this.car_type = car_type;
		this.car_spec = car_spec;
		this.rental_price = rental_price;
	}
	
	public String getCar_picture() {
		return car_picture;
	}

	public String getCar_name() {
		return car_name;
	}
	
	public String getCar_type() {
		return car_type;
	}

	public String getCar_spec() {
		return car_spec;
	}

	public int getRental_price() {
		return rental_price;
	}

	public void setCar_picture(String car_picture) {
		this.car_picture = car_picture;
	}

	public void setCar_name(String car_name) {
		this.car_name = car_name;
	}

	public void setCar_type(String car_type) {
		this.car_type = car_type;
	}

	public void setCar_spec(String car_spec) {
		this.car_spec = car_spec;
	}

	public void setRental_price(int rental_price) {
		this.rental_price = rental_price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
}