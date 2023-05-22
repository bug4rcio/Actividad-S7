/*
Resolver un problema que utilice una estructura Do-While usando un contador progresivo.
*/

package ejerciciob;

import java.util.Scanner;

public class EjercicioB {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int numero, contador = 0, suma = 0;

        System.out.println("Ingresar números enteros positivos.");
        System.out.println("(0 Para finalizar el programa)");
        System.out.println("");

        do {
            System.out.print("Ingrese un número: ");
            numero = sc.nextInt();

            if(numero > 0) {
                contador++;
                suma += numero;
            }
        } while(numero != 0);
        
        System.out.println("");
        System.out.println("Cantidad de números ingresados: "+contador);
        System.out.println("Suma: "+suma);
    }
}