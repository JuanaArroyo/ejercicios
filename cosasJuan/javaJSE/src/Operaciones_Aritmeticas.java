public class Operaciones_Aritmeticas {
    public static void main(String[] args) {

        //calcular area de un cuadrado lade de 5
        int ladoCuadrado = 5;
        int areaCuadrado= ladoCuadrado * ladoCuadrado;
        System.out.println("calcular area de un cuadrado= "+areaCuadrado);

        //calcular area de un circulo radio = 3
        int radioCirculo = 3;
        double areaCirculo= (3.14 * (radioCirculo*radioCirculo));
        System.out.println("calcula area de un circulo= "+areaCirculo);

        //obtener el iva 21% de un producto con valor 10
        int valorProducto = (10 * 21) / 100;
        System.out.println("obtener el iva 21% de un producto= "+valorProducto);

        //Calcular el area de un rectangulo de base = 5 y altura 4
        int lado1 = 5;
        int altura1 = 4;
        int rectangulin = lado1*altura1;
        System.out.println("Calcular el area de un rectangulo= "+rectangulin);

        //sacar el resto del número 8/2
        int resultado = (8%2);
        System.out.println("sacar el resto del número= "+resultado);

        //sacar el resto del número 9/2
        int resultado2 = (9%2);
        System.out.println("sacar el resto del número= "+resultado2);

    }
}
