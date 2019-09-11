package carRental.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import carRental.model.CarsList;

@Repository
public interface CarsRepository extends CrudRepository<CarsList, Integer> {
}
