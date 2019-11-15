package pl.mpas.git_examples.car.service;

import pl.mpas.git_examples.car.model.Car;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class CarProvider {

    public static List<Car> getMyCars(){
        return Arrays.asList(
                            new Car("audi","a3","silver",new BigDecimal(10000L),2),
                new Car("audi","a4","red",new BigDecimal(30000L),2),
                new Car("audi","a6","blue",new BigDecimal(25000L),3),
                new Car("chevrolet","camaro","yellow",new BigDecimal(100000L),5),
            new Car("bmw","e92","black",new BigDecimal(23000L),4));
        }
    }
}
