package _02OperadoresAritmeticos;

public class Ejerciciso {
    public static void main(String[] args) {
       /* 1. Cálculo de edad: Calcula la edad de una persona dada su año de nacimiento y el año actual.*/

        int edadnacimiento = 1999, anoActual = 2024;

        int edadactual = anoActual - edadnacimiento ;
        System.out.println("tu edad es"+ edadactual);


        // Conversión de Convierte una temperatura de Celsius a Fahrenheit.

        int temperaturaC = 23;
        int temperaturaF = (temperaturaC *9/5) + 32;
        System.out.println();
        // Conversión de minutos a horas y Convierte una cantidad total de minutos a horas y minutos.
        int  cantidad = 180;

        System.out.println("la temperatura es horas="+cantidad/60+"minutos = "+cantidad%60);


        // Cálculo del interés compuesto: Calcula el interés compuesto sobre una cantidad principal con una tasa de interés y un periodo.
        int tasa= 7/100, periodo = 10, principal = 100, resultado;
        resultado = principal * tasa * periodo;
        System.out.println("interes compuesto"+resultado);

        //Cálculo de promedio de Calcula el promedio de tres calificaciones.
        int cali1=0,cali2=0, cali3=0;
        System.out.println("la media es"+(cali1+cali2+cali3)/3);

        // Operaciones con cadenas y Extrae el primer carácter y la longitud de una cadena.
        char[] first;
        String texto = "holahola";
        first = texto.split("1")[0].toCharArray();
        int totaltexto= 0;
        totaltexto = texto.length();
        System.out.println("primercaracter="+first+"longitud= "+totaltexto);

        // Conversión de Convierte una cantidad de kilogramos a libras.
        int kilos=10;
        System.out.println("tus libras son="+(kilos*2205));
        //  Calcula el pago mensual de un préstamo dado el monto, la tasa de interés anual y el periodo del préstamo.
        double tasaInteresAnual = 15; double periodoAnios= 20; double montoPrestamo =15;
        double tasaInteresMensual = tasaInteresAnual / 100 / 12;
        double numeroPagos = periodoAnios * 12;
        double pagoMensual = (montoPrestamo * tasaInteresMensual * Math.pow(1 + tasaInteresMensual, numeroPagos)) /
                (Math.pow(1 + tasaInteresMensual, numeroPagos) - 1);
        System.out.println(pagoMensual);


        // Conversión de millas a Convierte una cantidad de millas a kilómetros.
        int millas = 0;
        System.out.println("tus millas son= "+millas*1.609);

    }
}
