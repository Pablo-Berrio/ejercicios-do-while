package org.example;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner entradaTeclado=new Scanner(System.in);
        Integer multiplicando;
        Integer multiplicador=1;

        System.out.print("Digita el numeroal que deseas conocerle su tabla de multiplicar: ");
        multiplicando= entradaTeclado.nextInt();

        do {
            System.out.println(multiplicando+"*"+multiplicador+"="+multiplicando*multiplicador);
            multiplicador +=1;

        }while (multiplicador<=10);
    }
}
