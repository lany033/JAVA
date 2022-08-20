package com.melanie;

public class Funciones {

    public static void main(String[] args) {
        holaMundo("kimis");
        holaMundo(4);


    }

    //Sobrecarga de funciones -> tienen el mismo nombre pero tienen diferentes parametros
    public static void holaMundo(String name){
        System.out.println("Hola " + name);
    }

    public static void holaMundo(Integer number){
        System.out.println("Hola " + number);
    }

    private  static String holaMundo(){
        return "Devuelve texto";
    }

    private static int sum(int num1, int num2){
        return num1 + num2;
    }

}
