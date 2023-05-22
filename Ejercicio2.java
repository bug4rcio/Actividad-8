/*
Resolver un problema que utilice una estructura For usando un contador interno regresivo.
*/

package ejercicio.pkg2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        int numeroF, numeroM;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresar un número final: ");
        numeroF = sc.nextInt();
        
        System.out.print("Ingrese un número menor que el primero: ");
        numeroM = sc.nextInt();
        
        System.out.println("");
        System.out.println("Cuenta regresiva...");
        for (int i = numeroF; numeroF >= numeroM; numeroF--) {
            System.out.println(numeroF);
        }
    }  
}