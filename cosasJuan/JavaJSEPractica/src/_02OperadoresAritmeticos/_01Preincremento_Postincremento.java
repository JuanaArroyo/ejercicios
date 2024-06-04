package _02OperadoresAritmeticos;

public class _01Preincremento_Postincremento {
    public static void main(String[] args) {
        int contador=1, contador2;
        contador = contador +1;
        System.out.println("Valor del contador --"+ contador);
        contador++;
        System.out.println("valor del contador --"+ contador);

        contador2 = contador++;
        System.out.println("valor del contador: "+ contador);
        System.out.println("valor del contador: "+ contador2);

        contador = 4;
        System.out.println("Preinciremento" + (8+ ++contador));

        contador = 4;
        System.out.println("Preinciremento2= " + (8+ contador++));
        System.out.println(contador);

        contador = +2;
        System.out.println("1"+contador);
        contador += 2;
        System.out.println("2"+contador);
        contador = +2;
        System.out.println("1"+contador);
    }
}
