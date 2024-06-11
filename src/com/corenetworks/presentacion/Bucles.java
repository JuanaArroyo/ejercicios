package com.corenetworks.presentacion;

import java.util.Scanner;

public class Bucles {
    public static void main(String[] args) {
        //mostrar numeros entre los rangos y pedirlos por consola

        Scanner meter = new Scanner(System.in);

                System.out.println("Introduce los numeros para mostrar su rango");

        int cuestion = meter.nextInt();

                System.out.println("ahora el otro");

        int cuestion2 = meter.nextInt();

            for (int cont = cuestion; cuestion < cuestion2; cont++){

                  cuestion++;
                  
                  System.out.println(cuestion);

        }
    }
}
