package com.melanie.metodos;

import com.melanie.Car;

public class ArrayMain {
    public static void main(String[] args) {
        String nombre1 = "nombre1";
        String nombre2 = "nombre2";
        String nombre3 = "nombre3";

        String[] nombres = new String[3];
        String[] nombres2 = new String[]{nombre1,nombre2,nombre3};

        int[] numeros = new int[5];
        Car[] cars = new Car[3];

        nombres[0] = nombre1;
        nombres[1] = nombre2;
        nombres[2] = nombre3;

        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
    }
}
