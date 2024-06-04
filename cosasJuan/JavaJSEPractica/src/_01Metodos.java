public class _01Metodos {
    public static void main(String[] args) {
        String frasr = "Este es un ejemplo de texto", palabra="casa", palabra2="Casa";

        System.out.println("numero de letras de la frase : " + frasr.length());
        System.out.println(frasr.toUpperCase());
        System.out.println(frasr.toLowerCase());
        System.out.println("La posicion en donde comiuenza la palabra ejemplo : "+ frasr.indexOf("ejemplo"));
        System.out.println("La posicion en donde comiuenza la o : "+ frasr.lastIndexOf("o"));
        System.out.println(frasr.equals(palabra));
        System.out.println(palabra.equalsIgnoreCase(palabra2));


        String  Ejerfrase ="Nunca mates una mosca sobre la cabeza de un tigre";
        System.out.println(Ejerfrase.toUpperCase());
        System.out.println(Ejerfrase.toLowerCase());
        System.out.println(Ejerfrase.substring(0,5));
        System.out.println(Ejerfrase.substring(15,21));
        System.out.println(Ejerfrase.substring(30,38));
        System.out.println(Ejerfrase.length());
        System.out.println(Ejerfrase.indexOf("a"));
    }
}



