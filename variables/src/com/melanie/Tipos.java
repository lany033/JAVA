package com.melanie;

public class Tipos {
    public static void main(String[] args) {
        //tipo de dadto | identificador de la variable | = |valor
        //declararlo y luego inicializarlo

        //Los tipos de datos primitivos no pueden ser nulos
        //enteros
        byte number1 = 1; //1 byte
        short number2 = 2; //2 byte
        int number3 = 3; //4 byte
        long number4 = 4; //8 byte

        //punto floteante
        float decimal1 = 4.9f;
        double decimal2 = 9.99d;

        //caracter
        char caracter1 = 'h'; //solo 1 caracter

        //booleanos
        boolean verdadero = true;

        //cadenas de texto
        String nombre = "Melanie";

        //tipos envoltorio envuelven a los tipos primitivos

        Integer numero = null;
        Long numero2 = 2L;
    }
}
