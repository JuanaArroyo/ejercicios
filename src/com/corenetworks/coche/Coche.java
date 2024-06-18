package com.corenetworks.coche;

public class Coche {

    //1.Atributos
    public String color;
    public boolean electrico;
    public String tipoRuedas;
    //2.Metodos
    public String acelerar (){
        return "el coche está acelerando . .";
    }
    public String frenar (){
        return "el coche está frenando . .";

    }
    public String aparcar (){
        return "el coche está APARCAO . .";

    }
    public Coche(){

    }
    public Coche(String color_entrada){
        color= color_entrada;
    }
}
