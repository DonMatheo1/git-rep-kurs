package pl.mpas.git_examples.car.service;

import pl.mpas.git_examples.car.model.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarFilter {
    public List<Car> findCarOfColor(List<Car> cars, String color){
        List<Car> carcolor= new ArrayList<Car>();

        for(Car car:cars){
            if(car.getColor().equals(color)){
                carcolor.add(car);
            }
        }
        return carcolor;


    }
    public List<Car> findCarOfColorJava8(List<Car> cars, String color){
       cars.stream()
               .filter(car -> car.getColor().equals(color));

        return Collections.emptyList();


    }
}
