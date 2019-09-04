package carRental;

public class CarsList {
	private int car_id;
	private String car_picture;
	private String car_name;
	private String car_spec;
	private int rental_price;
	
	public CarsList(int car_id,String car_picture, String car_name, String car_spec, int rental_price) {
		this.car_id = car_id;
		this.car_picture = car_picture;
		this.car_name = car_name;
		this.car_spec = car_spec;
		this.rental_price = rental_price;
	}

	public int getCar_id() {
		return car_id;
	}

	public String getCar_picture() {
		return car_picture;
	}

	public String getCar_name() {
		return car_name;
	}

	public String getCar_spec() {
		return car_spec;
	}

	public int getRental_price() {
		return rental_price;
	}	
	
}