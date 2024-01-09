
package adivinanzas;

import java.util.Random;
import java.util.Scanner;


public class Adivinanzas {

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        Random random = new Random();
        
        int numeroAdivinanza = random.nextInt(10)+1;
        
        System.out.println("Bienvenido al juego de adivinanzas");
        System.out.println("Intenta adivinar un numero entre el 1 al 10");
        
        int intentos = 3;
        
        while(intentos > 0){
            System.out.println("Tienes " + intentos + " intentos restantes");
            System.out.println("Ingresa tu numero de adivinanza: ");
            int intentoUsuario = scanner.nextInt();
            
            switch(intentoUsuario){
                case 1,2,3,4,5,6,7,8,9,10:
                    if(intentoUsuario == numeroAdivinanza){
                        System.out.println("Felicidades, has adivinado el numero " + numeroAdivinanza);
                        return;
                    }else{
                        System.out.println("Incorrecto. Intentalo de nuevo!!:");
                        intentos --;
                    }
                    break;
                default:
                    System.out.println("Numero no valido!!");
            }
        }
    }
    
}
