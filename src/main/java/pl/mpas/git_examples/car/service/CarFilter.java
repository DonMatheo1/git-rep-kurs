package pl.mpas.git_examples.car.service;

import pl.mpas.git_examples.car.model.Car;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static jdk.nashorn.internal.objects.NativeArray.forEach;

public class CarFilter {
    static public List<Car> findCarOfColor(List<Car> cars, String color){
        List<Car> carcolor= new ArrayList<Car>();

        for(Car car:cars){
            if(car.getColor().equals(color)){
                carcolor.add(car);
            }
        }
        return carcolor;


    }
    static public List<Car> findCarOfColorJava8(List<Car> cars, String color){
     return  cars.stream()
               .filter(car -> car.getColor().equals(color))
                .collect(Collectors.toList());



    }
    static public List<Car> findCarOfEngineAndCostsLessThanJava8(List<Car> cars, BigDecimal maxPrice,int minimalengine){
     return   cars.stream()
                .filter(car -> (car.getPrice().compareTo(maxPrice)<0)&&car.getEngine()<=2)

                .collect(Collectors.toList());



    }
    static public List<Car> filterCars(List<Car> cars, Predicate<Car> myFilter){
     return   cars.stream()
                .filter(myFilter)

                .collect(Collectors.toList());

    }

    public static void main(String[] args) {
        filterCars(CarProvider.getMyCars(),car -> car.getBrand().equals("audi"))
        .forEach(car -> System.out.println(car));
    }
}
