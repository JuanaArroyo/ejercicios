package com.corenetworks.presentacion;

import java.util.Objects;
import java.util.Scanner;

public class EjerAsistencia {
    public static void main(String[] args) {
        //Mostrar si un alumno tiene derecho a examen
        //Que tenga el 75% de las asistencias
        //Que tenga la documentacion
        //Solicitar el numero de horas del curso
        //Solicitar las asistencias
        //Solicitar las faltas
        //Solicitar si tiene la documentación
        Scanner escaner = new Scanner(System.in);
        Scanner escaneri= new Scanner(System.in);        boolean documentacion;
        int horascurso;
        int horasasist;
        int horasfalta;
        String respuesta1 = escaner.nextLine();
      if (Objects.equals(respuesta1, "Y")){
          System.out.println("introduce el n de horas del curso");
        horascurso = escaner.nextInt();
          System.out.println("introduce el n de horas ASISTIDAS");
          horasasist = escaner.nextInt();
          System.out.println("introduce el n de horas FALTADAS");
          horasfalta = escaner.nextInt();
          if (horasfalta < (horascurso * 0.25)){
              System.out.println("Puedes cursar el examen");

          }else{System.out.println("NO Puedes cursar el examen");

          }

      }else {System.out.println("NO Puedes cursar el examen");

      }





    }
}
