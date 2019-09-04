package carRental;

public class Rental {
	private int car_id;
	private String car_name;
	private int rental_price;
	private int time;
	private int total_price;
	
	public Rental() {
		super();
	}
	
	public Rental(int car_id, int time) {
		super();
		this.car_id = car_id;
		this.time = time;
	}
	
	public Rental(int cars_id, String car_name, int rental_price, int time, int total_price) {
		super();
		this.car_id = cars_id;
		this.car_name = car_name;
		this.rental_price = rental_price;
		this.time = time;
		this.total_price = total_price;
	}
	
	public int getCar_id() {
		return car_id;
	}
	public void setCar_id(int car_id) {
		this.car_id = car_id;
	}
	public String getCar_name() {
		return car_name;
	}
	public void setCar_name(String car_name) {
		this.car_name = car_name;
	}
	public int getRental_price() {
		return rental_price;
	}
	public void setRental_price(int rental_price) {
		this.rental_price = rental_price;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}

	public int getTotal_price() {
		return total_price;
	}

	public void setTotal_price(int total_price) {
		this.total_price = total_price;
	}
		
	
}
