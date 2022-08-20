package com.melanie.interfaces;

import com.melanie.Car;
import com.melanie.CocheElectrico;
import com.melanie.interfaces.CocheService;

public class CocheServiceSportImpl implements CocheService {

    @Override
    public Car crearCocheDemo() {
        System.out.println("creando coche de carreras...");
        return new CocheElectrico();
    }

    @Override
    public void destruirCoche(Car car) {

    }
}
