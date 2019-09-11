package carRental.model;

public class Rental {
	
    private int id;
    private String car_name;
    private int rental_price;
    private int time;
    private int total_price;
    
    public Rental() {super();}
    
    public Rental(int id, int time) {
        super();
        this.id = id;
        this.time = time;
    }
    
    public Rental(int id, String car_name, int rental_price, int time, int total_price) {
        super();
        this.id = id;
        this.car_name = car_name;
        this.rental_price = rental_price;
        this.time = time;
        this.total_price = total_price;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
    
}
