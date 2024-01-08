package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    private List<Car> carsList;

    public CarDaoImpl() {
        carsList = new ArrayList<>();
        carsList.add(new Car("lada", 1, 2020));
        carsList.add(new Car("pegeout", 2, 2017));
        carsList.add(new Car("audi", 3, 2019));
        carsList.add(new Car("haval", 4, 2023));
        carsList.add(new Car("bmv", 5, 2015));
    }

    @Override
    public List<?> getCars(Integer count) {
        if (count == null || count > 4) {
            return carsList;
        }
        return carsList.subList(0, count);
    }
}
