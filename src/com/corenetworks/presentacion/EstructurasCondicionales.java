package com.corenetworks.presentacion;

import java.text.BreakIterator;

public class EstructurasCondicionales {
    public static void main(String[] args) {
        //si una persona puede conduicr ciclomotor
        int edad = 18;
        if (edad>= 18){
            System.out.println("es mayor de edad");
        }else {
            System.out.println("Es menor de edad");
        }
        //decir si un numero es multiplo de 4
        int posiblemultiplo = 5;
        if (posiblemultiplo % 4 == 0){
            System.out.println("Es un multiplos");
        }else {
            System.out.println("no lo es");
        }

        //poner en letra una nota
        int nota = 7;
        switch (nota){
            case 1,2,4,3,0:
                System.out.println("Has suspendio");
                break;
            case 5:
                System.out.println("suficiente justito");
                break;
            case 6:
                System.out.println("bien");
                break;
            case 7,8:
                System.out.println("notable");
                break;
            case 9,10:
                System.out.println("salientesobre");

        }

    }
}
