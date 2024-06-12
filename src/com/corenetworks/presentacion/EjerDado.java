package com.corenetworks.presentacion;

import java.util.Random;
import java.util.Scanner;

public class EjerDado {
    public static void main(String[] args) {
        //Simular un dado
//Lanzarlo 100 veces
//Calcular el porc0entaje que ha salido cada número
        int conti = 0;
        int[] cara = {1, 2, 3, 4, 5 ,6,7};
for (int c = 0;c < 100;c++){
    Random randon = new Random();
    int randomInt = randon.nextInt(1,7);
   switch (randomInt){
       case 1 -> cara[1]++;
       case 2 -> cara[2]++;
       case 3 -> cara[3]++;
       case 4 -> cara[4]++;
       case 5 -> cara[5]++;
       case 6 -> cara[6]++;


   }

}
for (int d = 0; d < 6;d++ ){

            System.out.println(d+1 +"="+cara[6]--);
        }
//Pedir por consola una frase
//Contar las vocales de la frase



    }

}
