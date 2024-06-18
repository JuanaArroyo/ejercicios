package com.corenetworks.presentacion;

import com.corenetworks.coche.Coche;

import java.net.StandardSocketOptions;

public class Main {
    public static void mian (String[] args){
        Coche c1 = new Coche();

        c1.color = "Amarillo";
        c1.electrico = false;
        c1.tipoRuedas = "Deportivas";

        System.out.println(c1.acelerar());
        System.out.println(c1.aparcar());
        System.out.println(c1.frenar());
    }

    }
