package com.ejemplos;

public class Funciones {
    public static void main(String[] args) {
        //opcion 1 -> sin parametros y sin tipo de retorno
        showMenu();
        //opcion 2 -> funcion sin paramertros y con tipo de retorno
        String menu = getMenu();
        System.out.println(menu);
        //opcion 3 -> funcion con paramertros y sin tipo de retorno
        imprimirSaludo("Melanie");
        //opcion 4 -> funcion con paramertros y con tipo de retorno
        String nombre = "Melanie";
        String apellido = "Apellido";
        String saludo = obtenerSaludo(nombre,apellido);
    }

    static String obtenerSaludo(String nombre, String apellidos){
        return "Buenas tardes" + nombre + " " + apellidos;
    }

    static void imprimirSaludo(String name) {
        System.out.println("Buenos dias " + name);
    }

    static void showMenu() {
        System.out.println("Bienvenido");
        System.out.println("zapatillas");
        System.out.println("ropa");
        System.out.println("salir");
    }

    static String getMenu(){
        return "Bienvenisod al sistema de";
    }
}