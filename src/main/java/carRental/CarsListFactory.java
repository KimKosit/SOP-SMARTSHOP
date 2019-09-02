package carRental;

import java.util.ArrayList;
import java.util.List;

public class CarsListFactory {
	
	public static CarsList[] cars_list = new CarsList[] {
		new CarsList(1, "https://t1-cms-4.images.toyota-europe.com/toyotaone/gben/toyota-gt86-2018-BlackTouch-exterior-tme-012-a-full_tcm-3060-1329269_tcm-3060-1654566.jpg","Toyota GT86", "2.0 Boxer", 1000),
		new CarsList(2, "https://s.aolcdn.com/commerce/autodata/images/USC90NIC141D121001.jpg","Nissan 370z Nismo", "3.7 V6", 1100),
		new CarsList(3, "https://upload.wikimedia.org/wikipedia/commons/d/dc/HondaS2000-004.jpg","Honda S2000", "2.2 VTEC", 1200),
		new CarsList(4, "https://d1zgdcrdir5wgt.cloudfront.net/media/vehicle/images/WlVcORYLTLOnq4FktekFPw.1440x700.jpg","Porsche 718 Boxster", "2.0 Mid-Engine", 1300),
		new CarsList(5, "https://i.pinimg.com/originals/fd/eb/4d/fdeb4dcd54bbec0f4fb8075262611e0f.jpg","Audi R8 V10 Plus", "5.2 V10", 1500),
	};

	public static CarsList[] getAllCars_list() {
		return cars_list;
	}
	
	public static CarsList getCars_list(int selected_id) {
		for (CarsList car: cars_list) {
            if (car.getCar_id() == selected_id) return car;
        }
        return null;
	}
	
	

}
