/*
Realizar un juego para adivinar un número.
Para ello generar un número aleatorio entre 0-100, y luego ir pidiendo números indicando:
“Es mayor” o “Es menor” según sea mayor o menor con respecto a N.
El proceso termina cuando el usuario acierta y mostrar el número de intentos.
*/

package ejerciciob4;

import java.util.Scanner;

public class EjercicioB4 {

    public static void main(String[] args) {
        
        int numero, aleatorio, intentos = 0;
        
        Scanner sc = new Scanner(System.in);
        
        aleatorio = (int) (Math.random() * 100);
        
        do{
            System.out.println("Ingresar un número:");
            numero = sc.nextInt();
            
            if(numero > aleatorio){
                System.out.println("¡Es menos!");
            } else{
                System.out.println("¡Es más!");
            }
            intentos++;
            
        } while(numero != aleatorio);
        
        System.out.println("");
        System.out.println("¡Adivinaste el número en: "+intentos+" intentos!");
    }  
}