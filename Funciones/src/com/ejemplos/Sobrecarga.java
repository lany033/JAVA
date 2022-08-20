package com.ejemplos;

//Sobrecarga -> permite duplicar un metodo siempre ycuando tenfa diferente numero o tipo de parametros

public class Sobrecarga {
    public static void main(String[] args) {

    }

    static int suma(int numero1, int numero2){
        return numero1 + numero2;
    }

    static int suma(int numero1, int numero2, int nummero3){
        return numero1 + numero2;
    }
}
