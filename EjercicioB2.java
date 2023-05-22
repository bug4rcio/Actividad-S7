/*
Resolver un problema que utilice una estructura Do-While usando un contador regresivo.
*/

package ejerciciob2;

import java.util.Scanner;

public class EjercicioB2 {

    public static void main(String[] args) {
        
        int numero;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresar un número positivo: ");
        numero = sc.nextInt();

        System.out.println("Cuenta regresiva:");

        do {
            System.out.println(numero);
            numero--;
        } while(numero >= 0);
    }  
}