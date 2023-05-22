/*
Resolver un problema que utilice una estructura For usando un contador adicional y un
acumulador.
*/

package ejercicio.pkg4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        
        int numeros;
        int pares = 0, impares = 0;
        int sumapares = 0, sumaimpares = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresar 5 números: ");
        System.out.println("");
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Ingresar número: "+i);
            numeros = sc.nextInt();
            
            if (numeros % 2 == 0) {
                pares++;
                sumapares += numeros;
            } else{
                impares++;
                sumaimpares += numeros;
            }
        }
        
        System.out.println("Cantidad de números pares: " +pares);
        System.out.println("Suma de los números pares: " +sumapares);
        System.out.println(""); //Separador
        System.out.println("Cantidad de números impares: " +impares);
        System.out.println("Suma de los números impares: " +sumaimpares);
    }
}