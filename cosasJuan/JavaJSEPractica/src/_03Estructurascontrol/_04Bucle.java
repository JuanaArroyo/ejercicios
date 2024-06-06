package _03Estructurascontrol;

import java.util.Scanner;

public class _04Bucle {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Holamundo");
        }
        //1. Pedir un número N, y mostrar todos los números del 1 al N.
        Scanner scanner = new Scanner(System.in);


        System.out.print("Por favor, ingresa un número: ");
        int N = scanner.nextInt();


        System.out.println("Los números del 1 al " + N + " son:");
        for (int i = 1; i <= N; i++) {
            System.out.println(i);

            //2. Escribir todos los números del 100 al 0 de 7 en 7.
            System.out.println("Los números del 100 al 0 de 7 en 7 = ");
            for (int u = 100; u >= 0; u -= 7) {
                System.out.println(i);

                //3. Diseñar un programa que muestre el producto de los 10 primeros números impares.
                long producto = 1;
                int contador = 0, numero = 1;

                while (contador < 10) {
                    producto *= numero;
                    numero += 2;
                    contador++;
                }


                System.out.println("El producto de los primeros 10 números impares =  " + producto);
            }
            //4. Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos y
            //la cantidad de ceros.
            Scanner plop = new Scanner(System.in);

            int CONT;
            for (CONT = 1; boolean b CONT <= 10;
            CONT++);
            {

                //5. Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de 1000€.
                //6. Pedir un número N, introducir N sueldos, y mostrar el sueldo máximo.
            }
        }
    }
}