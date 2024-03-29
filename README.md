# **:racing_car: Car Rental API :racing_car:**

Car Rental Smart Shop API:oncoming_automobile:

## JSON Structure :construction:

~~~
{  
	"id": Car ID,
	"car_name": Amount of time in hours,
	"car_type": Type of car,
	"car_picture": Link of car's picture,
	"car_spec": Specification of car,
	"rental_price": Rental price/Hour
}
~~~

## GET :thought_balloon:
1. Show all cars.
```sh
http://localhost:port/carslist/
```
2. Show specific car.
~~~
http://localhost:port/carslist/{id}/
~~~

## POST :speech_balloon:

1. Rent a car.
~~~
http://localhost:port/rental/{id}
~~~
<b>POST with body contain JSON like below</b>
~~~
{  
	"id": Car ID,
	"time": Total of hours you want to rent
}
~~~
2. Add a car.
~~~
http://localhost:port/addCar/
~~~
<b>POST with body contain JSON like below</b>
~~~
{  
	"id": Car ID,
	"car_name": Amount of time in hours,
	"car_type": Type of car,
	"car_picture": Link of car's picture,
	"car_spec": Specification of car,
	"rental_price": Rental price/Hour
}
~~~

## PUT :dash: 

- Update car information.
~~~
{  
	"id": Car ID  
	"car_name": Amount of time in hours  
	"car_type": Type of car  
	"car_picture": Link of car's picture  
	"car_spec": Specification of car  
	"rental_price": Rental price/Hour  
}
~~~

## DELETE :boom:

1. Delete some cars.
~~~
http://localhost:port/delete/{id}/
~~~
2. Delete all cars.
~~~
http://localhost:port/delete/
~~~

## Credit:copyright:

- <b>Made by KimKho:tm:</b>
	- <b>Name : Kosit Kositsrikunakorn</b>
	- <b>Student ID : 60070008</b>