package com.ejemplos;

public class ejerciciFunciones {
    public static void main(String[] args) {
        float precioFinal = getPrice(18,18);
        System.out.println(precioFinal);
    }

    static float getPrice(float price, float iva) {
        return price + (price * (iva/100));
    }
}
