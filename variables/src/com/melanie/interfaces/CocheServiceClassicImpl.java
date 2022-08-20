package com.melanie.interfaces;

import com.melanie.Car;
import com.melanie.CocheElectrico;
import com.melanie.interfaces.CocheService;

public class CocheServiceClassicImpl implements CocheService {

    @Override
    public Car crearCocheDemo() {
        System.out.println("creando coche clasico...");
        return new CocheElectrico();
    }

    @Override
    public void destruirCoche(Car car) {
        System.out.println("destruir Coche...");
    }
}
