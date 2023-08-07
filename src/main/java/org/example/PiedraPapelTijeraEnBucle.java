package org.example;

import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijeraEnBucle {
    public static void main(String[] args) {
      Scanner entradaPorTeclado=new Scanner(System.in);
      Random generador=new Random();
      String respuestaUsuario;

      do {
          String opcionPc, opcionHumano;
          Integer numeroAleatorio=generador.nextInt(3)+1;
          System.out.println("BIENVENIDO AL CLASICO JUEGO DE PIEDRA PAPEL O TIJERA, JUGARAS CONTRA EL PC");
          System.out.println("A CONTINUACION ESCRIBE TU ELECCION ENTRE LAS SIGUIENTES OPCIONES");
          System.out.println("PIEDRA");
          System.out.println("PAPEL");
          System.out.println("TIJERA");
          opcionHumano= entradaPorTeclado.nextLine();
          System.out.println("TU OPCION ES: "+opcionHumano);

          switch (numeroAleatorio){
              case 1:
                  opcionPc="PIEDRA";
                  break;
              case 2:
                  opcionPc="PAPEL";
                  break;
              case 3:
                  opcionPc="TIJERA";
                  break;
              default:
                  opcionPc=null;
          }

          System.out.println("LA OPCION DEL PC ES: "+opcionPc);

          if (opcionPc.equalsIgnoreCase(opcionHumano)){
              System.out.println("EMPATE");
          } else if (opcionPc.equalsIgnoreCase("PIEDRA")&&opcionHumano.equalsIgnoreCase("PAPEL")) {
              System.out.println("GANA EL HUMANO");
          } else if (opcionPc.equalsIgnoreCase("PIEDRA")&&opcionHumano.equalsIgnoreCase("TIJERA")) {
              System.out.println("GANA EL PC");
          } else if (opcionPc.equalsIgnoreCase("PAPEL")&&opcionHumano.equalsIgnoreCase("PIEDRA")) {
              System.out.println("GANA EL PC");
          } else if (opcionPc.equalsIgnoreCase("PAPEL")&&opcionHumano.equalsIgnoreCase("TIJERA")) {
              System.out.println("GANA EL HUMANO");
          } else if (opcionPc.equalsIgnoreCase("TIJERA")&&opcionHumano.equalsIgnoreCase("PIEDRA")) {
              System.out.println("GANA EL HUMANO");
          } else if (opcionPc.equalsIgnoreCase("TIJERA")&&opcionHumano.equalsIgnoreCase("PAPEL")) {
              System.out.println("GANA EL PC");
          }

          System.out.println("DESEAS JUGAR NUEVAMENTE? (SI/NO)");
          respuestaUsuario=entradaPorTeclado.nextLine();

      }while (respuestaUsuario.equalsIgnoreCase("si"));
        System.out.println("GRACIAS POR JUGAR, VUELVA PRONTO!");

    }
}






