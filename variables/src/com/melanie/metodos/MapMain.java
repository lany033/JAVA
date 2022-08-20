package com.melanie.metodos;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {

        Map<String, String> personas = new HashMap<>();

        personas.put("1223456h","nombre apellido 1");
        personas.put("1223456r","nombre apellido 1");
        personas.put("1223456w","nombre apellido 1");

        //System.out.println(personas);

        for (String key : personas.keySet()) {
            System.out.println(key);
        }

        for(String value : personas.values()) {
            System.out.println(value);
        }

        for(Map.Entry<String, String> pair : personas.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }

    }
}
