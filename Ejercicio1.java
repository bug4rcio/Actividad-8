/*
Resolver un problema que utilice una estructura For usando un contador interno progresivo.
*/

package ejercicio.pkg1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        int numeroI, numeroF;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresar un número inicial: ");
        numeroI = sc.nextInt();
        
        System.out.print("Ingrese un número final mayor que el primero: ");
        numeroF = sc.nextInt();
        
        System.out.println("");
        System.out.println("Cuenta progresiva...");
        for (int i = numeroI; numeroI <= numeroF; numeroI++) {
            System.out.println(numeroI);
        }
    }
}