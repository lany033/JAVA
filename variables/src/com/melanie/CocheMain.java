package com.melanie;

public class CocheMain {

    public static void main(String[] args) {
        String coche = "alfa romeo";

        //Operador new permite crear un objeto a partir de una clase
        // Car cocheObjeto = new Car();

        //Cada que se cree un objeto -> instancia de una clase
        CocheElectrico cocheObjeto2 = new CocheElectrico("rojo","honda","civic",12344.6,34.7,"V8");

        cocheObjeto2.acelerar(50);
        System.out.println(cocheObjeto2);

        cocheObjeto2.peso = 1359.8;
        System.out.println(cocheObjeto2);

        //****************************************************************
        //instanciamos de la clase heredad CocheElectrico
        CocheElectrico cocheElectrico = new CocheElectrico();
        cocheElectrico.motorElectrico = "ejemplo motor";
        cocheElectrico.color="red";
        cocheElectrico.fabricante = "honda";

        //****************************************************************
        //SUPER
        //Cuando vemos que opciones nos da CocheElectrico solo esta la opcion motorElectrico
        CocheElectrico cocheElectrico2 = new CocheElectrico("rojo","alfa","romeo",1500d,7.99,"txz");
        //SERIA bueno enviar todos los parametros que tiene el coche.
        System.out.println(cocheElectrico2);

        //***************************************************************
        //SOBREESCRITURA de funciones -> Permite cambiar el comportamiento del metodo heredado en ves de utilizarlo tal cual
        cocheElectrico2.acelerar(50);
    }
}
