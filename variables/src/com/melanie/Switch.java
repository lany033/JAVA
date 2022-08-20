package com.melanie;

public class Switch {
    public static void main(String[] args) {
        String weather = "sunny";

        switch (weather){
            case "sunny":
                System.out.println("Timepo soleado");
                break;
            case "cloudy":
                System.out.println("timepo nublado");
                break;
            default:
                System.out.println("No se ha podido identificar el climea");
                break;
        }
    }
}
