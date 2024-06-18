package com.corenetworks.presentacion;

import java.util.Scanner;

public class Decirsiprimono {  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);


    System.out.println("Ingresa una frase:");
    String frase = scanner.nextLine();


    int contadorA = 0, contadorE = 0, contadorI = 0, contadorO = 0, contadorU = 0;


    frase = frase.toLowerCase();


    for (char caracter : frase.toCharArray()) {
        switch (caracter) {
            case 'a':
                contadorA++;
                break;
            case 'e':
                contadorE++;
                break;
            case 'i':
                contadorI++;
                break;
            case 'o':
                contadorO++;
                break;
            case 'u':
                contadorU++;
                break;
        }
    }


    System.out.println("Cantidad de vocales 'a': " + contadorA);
    System.out.println("Cantidad de vocales 'e': " + contadorE);
    System.out.println("Cantidad de vocales 'i': " + contadorI);
    System.out.println("Cantidad de vocales 'o': " + contadorO);
    System.out.println("Cantidad de vocales 'u': " + contadorU);




            for (int i = 200; i >= 100; i--) {
                System.out.println(i);

            }
        }

}