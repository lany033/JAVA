package com.melanie.interfaces;

import com.melanie.Car;

public class InterfacesMain {
    public static void main(String[] args) {

        CocheService service1 = new CocheServiceClassicImpl();
        CocheService service2 = new CocheServiceSportImpl();

        Car coche1 = service1.crearCocheDemo();
        Car coche2 = service2.crearCocheDemo();
    }
}
