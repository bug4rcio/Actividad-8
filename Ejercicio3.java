/*
Resolver un problema que utilice una estructura For usando un contador adicional.
*/

package ejercicio.pkg3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        int numeros, conteoCeros = 0, conteoPos = 0, conteoNeg = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresar 5 números:");
        System.out.println("");
        
        for(int i = 1; i <= 5; i++){
            System.out.println("Ingresar número: "+i);
            numeros = sc.nextInt();
            
            if(numeros > 0){
                conteoPos++;
            } else if(numeros < 0){
                conteoNeg++;
            } else{
                conteoCeros++;
            }
        }
        
        if(conteoPos > 1){
            System.out.println("Se ingresaron "+conteoPos+" números positivos.");
        } else if(conteoPos == 1){
            System.out.println("Se ingresó "+conteoPos+" número positivo.");
        } else{
            System.out.println("No se ingresaron números positivos");
        }
        
        if(conteoNeg > 1){
            System.out.println("Se ingresaron "+conteoNeg+" números negativos.");
        } else if(conteoNeg == 1){
            System.out.println("Se ingresó "+conteoNeg+" número negativo.");
        } else{
            System.out.println("No se ingresaron números negativos");
        }
        
        if(conteoCeros > 1){
            System.out.println("Se ingresaron "+conteoCeros+" ceros.");
        } else if(conteoCeros == 1){
            System.out.println("Se ingresó "+conteoCeros+" cero.");
        } else{
            System.out.println("No se ingresaron ceros.");
        }
    } 
}