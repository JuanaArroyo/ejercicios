import com.sun.tools.javac.Main;

public class Tipos_Primitivos {
    public static void main(String[] args) {
        //Definicion de variables de tipo primitivo
        byte enteroMasPequeno = 15;
        System.out.println("variable entero mas pequeño "+ enteroMasPequeno);
        enteroMasPequeno = 16;
        System.out.println("variable entero mas pequeño "+ enteroMasPequeno);
        short enteroPequeno = 300;
        System.out.println("variable entero pequeño "+ enteroPequeno);
        int entero = 154_222;
        System.out.println("variable entera "+ entero);
        long enteroLargo = 124_1322L;
        System.out.println("variable entera larga" + enteroLargo);
        //Ahora con decimales!!
        float decimalPequeno = 132.43F;
        System.out.println("variabla decimal pequeña"+ decimalPequeno);
        double decimal = 123_123_123.234;
        System.out.println("variable decimal"+ decimal);
        //otros tipos primitivos
        char letra = 'a';
        System.out.println("letra" + letra);
        boolean terminado = false;
        System.out.println("terminado" + terminado);

    }

}
