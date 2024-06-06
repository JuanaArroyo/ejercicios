package _03Estructurascontrol;

public class _01Ejerciciosif {
    public static void main(String[] args) {
        //decir por la edad si se puede votar
        int edad = 15;
        boolean inscrito = false;
        if (edad >= 18 && inscrito) {
            System.out.println("Puedes votar");
        } else {
            System.out.println("no puedes votar");
        }
        //Decir si la contraseña es correcta debe ser igual a 1234A
        String contraseña = "14tr ";
        if (contraseña == "14tr") {
            System.out.println("La contraseña es correcta");


        } else {
            System.out.println("Es incorrecta");
        }


        //Verifica si un número está dentro del rango 10-20 o es igual a 30.
        int numero = 15;
        if (numero >= 10 && numero <= 20 || numero == 30) {
            System.out.println("El numero " + numero + " cumple estar en el rango de 10-20 o es igual a 30");
        } else {
            System.out.println("El numero no cumple con las condiciones");
        }
        //Si la cantidad es mayor a 3 y el producto es "Manzana" dar un 5% de descuento
        int cantidad = 5;
        String nombreProducto = "Manzana";
        if (cantidad > 3 && nombreProducto.equals("Manzana")) {
            System.out.println("Tiene un descuento del 5%");
        } else {
            System.out.println("No cumple con alguna condicion");
        }
        //Pedir dos números y decir cual es el mayor o si son iguales.
        int numero1 = 5, numero2 = 7;
        if (numero1 > numero2) {
            System.out.println("El numero1 es mayor " + numero1);
        } else if (numero1 == numero2) {
            System.out.println("Son iguales con valor " + numero1);
        } else {
            System.out.println("El numero2 es mayor " + numero2);
        }

        //Pedir dos números y mostrarlos ordenados de mayor a menor.
        int numeroA = 5, numeroB = 7;
        if (numeroA > numeroB) {
            System.out.println("De mayor a menor " + numeroA + " " + numeroB);
        } else {
            System.out.println("De mayor a menor " + numeroB + " " + numeroA);
        }
        //Pedir un número entre 0 y 9.999 y decir cuantas cifras tiene
        int num = 44;
        if (num < 10) {
            System.out.println("El numero tiene una cifra");
        } else if (num < 100) {
            System.out.println("El numero tiene dos cifras");
        } else if (num < 1000) {
            System.out.println("El numero tiene tres cifras");
        } else {
            System.out.println("El numero tiene cuatro cifras");
        }

    }}