/*
Resolver un problema que utilice una estructura Do-While usando un acumulador progresivo.
*/

package ejerciciob3;

import java.util.Scanner;

public class EjercicioB3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int numero, acumulador = 0;

        System.out.println("Ingresar números enteros positivos.");
        System.out.println("(0 Para finalizar el programa)");
        System.out.println("");

        do {
            System.out.print("Ingresar un número: ");
            numero = sc.nextInt();

            if(numero > 0) {
                acumulador += numero;
            }
        } while(numero != 0);
        
        System.out.println("");
        System.out.println("Suma: "+acumulador);
    }
}