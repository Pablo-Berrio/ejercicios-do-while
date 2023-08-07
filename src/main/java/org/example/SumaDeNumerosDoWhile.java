package org.example;

import java.util.Scanner;

public class SumaDeNumerosDoWhile {
    public static void main(String[] args) {
        Scanner entradaTeclado=new Scanner(System.in);
        Integer numeroIngresado;
        Integer suma=0;

        do {

            System.out.print("ingresa un nuevo numero para sumar: ");
            numeroIngresado= entradaTeclado.nextInt();
            suma=numeroIngresado+suma;

        }while (numeroIngresado>0);
        System.out.println("la suma de todos los numeros es: "+suma);


    }
}
