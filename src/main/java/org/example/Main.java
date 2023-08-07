package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entradaTeclado=new Scanner(System.in);

        Double matematicas, ciencias, historia, promedio;
        String estado;

        System.out.println("ingrese su nota de matematicas en un rango entre 1.0 y 5.0: ");
        matematicas=entradaTeclado.nextDouble();
        System.out.println("ingrese su nota de ciencias en un rango entre 1.0 y 5.0: ");
        ciencias=entradaTeclado.nextDouble();
        System.out.println("ingrese su nota de historia en un rango entre 1.0 y 5.0: ");
        historia=entradaTeclado.nextDouble();

        promedio=(matematicas+ciencias+historia)/3;
        System.out.println("promedio = " + promedio);

        estado=promedio>=4.0? "Aprobado" : "Rechazado";
        System.out.println("estado = " + estado);











    }
}