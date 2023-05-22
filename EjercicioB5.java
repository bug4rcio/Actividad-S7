/*
Elaborar un programa que muestre un menú de 5 opciones y cada opción permita resolver
algún ejercicio desarrollado en alguna tarea previa.
*/

package ejerciciob5;

import java.util.Scanner;

public class EjercicioB5 {

    public static void main(String[] args) {
        
        int opcion;
        
        //Ejercicio 1
        int nop1, ac1 = 1, resultado;
        
        //Ejercicio2
        double nop2;
        boolean condicion;
        
        //Ejercicio3
        int nop3;
        
        //Ejercicio4
        int ac4 = 4;
        
        //Ejercicio5
        int nop51, nop52, ac5;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresar un número: ");
        
        do{
            System.out.println("");
            System.out.println("#######################################################");
            System.out.println("#                 < MENÚ DE OPCIONES >                #");
            System.out.println("#######################################################");
            System.out.println("# 1: Tabla de multiplicar                             #");
            System.out.println("# 2: Determinar si número ingresado es entero.        #");
            System.out.println("# 3: Determinar si número entero positivo es par.     #");
            System.out.println("# 4: Imprimir y sumar 40 términos de una serie.       #");
            System.out.println("# 5: Mostrar números entre n1 y n2.                   #");
            System.out.println("# 0: Salir                                            #");
            System.out.println("#######################################################");
            System.out.println("");
            
            System.out.print("Ingresar opción: ");
            opcion = sc.nextInt();
            System.out.println("");
            
            switch(opcion){
                case 1:
                    System.out.println("Ingresar número para realizar tabla:");
                    nop1 = sc.nextInt();
                    System.out.println("");
                    while(ac1 <= 12){
                        resultado = (nop1 * ac1);
                        System.out.println(+ac1+ " x " +nop1+ " = " +resultado);
                        ac1++;
                    } break;
                    
                case 2:
                    System.out.println("Ingresar un número:");
                    nop2 = sc.nextDouble();
                    System.out.println("");
                    if (nop2 == (int) nop2) {
                        condicion = true;
                        System.out.println(nop2 + " es un número entero?: " + condicion);
                    } else{
                        condicion = false;
                        System.out.println(nop2 + " es un número entero?: " + condicion);
                    } break;
                    
                case 3:
                    System.out.println("Ingresar un número:");
                    nop3 = sc.nextInt();
                    System.out.println("");
                    if (nop3 > 0 && nop3 % 2 == 0) {
                        System.out.println("Es un número positivo y par");
                    } else{
                        System.out.println("No es un número positivo o no es par");
                    } break;

                case 4:
                    while(ac4 <= 40){
                        System.out.print("("+ac4+")");
                        ac4 += 3;
                    } 
                    System.out.println("");
                    break;
                    
                case 5:
                    System.out.println("Ingresar (2) números naturales:\n"
                    + "El segundo número debe ser mayor y diferente al primero.");
                    nop51 = sc.nextInt();
                    nop52 = sc.nextInt();
                    if (nop51 < 0 || nop52 < 0){
                        System.out.println("Ingresar solo números naturales.");
                    } else if(nop51 != nop52 && nop52 > nop51){
                        ac5 = (nop51+1);
                        System.out.println("");
                        while(ac5 < nop52){
                        System.out.print("("+ac5+")");
                        ac5++;
                        }
                        System.out.println("");
                    } else{
                        System.out.println("");
                        System.out.println("Leer la instrucción.");
                    } break;

                default: break;
            } 
        } while(opcion != 0);
    }
}