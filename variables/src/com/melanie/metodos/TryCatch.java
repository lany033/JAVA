package com.melanie.metodos;

public class TryCatch {
    public static void main(String[] args) {

        try{
            int result = 5 / 0;
        }catch (ArithmeticException e){
            e.printStackTrace();
        }finally {
            System.out.println("cierre de recursos");
        }

        System.out.println("fin");
    }
}
