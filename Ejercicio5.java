/*
Elaborar un programa que genere un reporte ASCII utilizando la estructura repetitiva For.
*/

package ejercicio.pkg5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        
        int opcion;
        int promedio = 0, sumaNotas = 0;
        int n1, n2, n3, n4, n5, n6;
        boolean notaIncorrecta = true;
        String nombre = null, apellido = null;
        String condicion = null, mensaje = null;
        String notas = null;
        
        Scanner sc = new Scanner(System.in);
        
        for(int i = 1; i <= 5; i++){
            
            System.out.println("");
            System.out.println("##################################");
            System.out.println("#        MENÚ DE OPCIONES        #");
            System.out.println("##################################");
            System.out.println("# 1: Ingresar datos              #");
            System.out.println("# 2: Ingresar notas              #");
            System.out.println("# 3: Condición de alumno         #");
            System.out.println("# 4: Crear resumen               #");
            System.out.println("# 5: Salir                       #");
            System.out.println("##################################");
            System.out.println("");
            
            System.out.println("Ingresar opción:");
            opcion = sc.nextInt();
            System.out.println("");
            
            switch(opcion){
                case 1:
                    System.out.println("< Datos del alumno >");
                    System.out.println("Nombre:");
                    nombre = sc.next();
                    System.out.println("Apellido:");
                    apellido = sc.next();
                    break;
                    
                case 2:
                    System.out.println("< Notas del alumno >");
                    do{
                        System.out.println("Nota N°: 1");
                        n1 = sc.nextInt();
                        notaIncorrecta = (n1 < 0 || n1 > 20);
                        if(notaIncorrecta){
                            System.out.println("Se ha introducido una nota inválida.");
                        }
                    } while(notaIncorrecta);
                    
                    do{
                        System.out.println("Nota N°: 2");
                        n2 = sc.nextInt();
                        notaIncorrecta = (n2 < 0 || n2 > 20);
                        if(notaIncorrecta){
                            System.out.println("Se ha introducido una nota incorrecta.");
                        }
                    } while(notaIncorrecta);
                    
                    do{
                        System.out.println("Nota N°: 3");
                        n3 = sc.nextInt();
                        notaIncorrecta = (n3 < 0 || n3 > 20);
                        if(notaIncorrecta){
                            System.out.println("Se ha introducido una nota incorrecta.");
                        }
                    } while(notaIncorrecta);
                    
                    do{
                        System.out.println("Nota N°: 4");
                        n4 = sc.nextInt();
                        notaIncorrecta = (n4 < 0 || n4 > 20);
                        if(notaIncorrecta){
                            System.out.println("Se ha introducido una nota incorrecta.");
                        }
                    } while(notaIncorrecta);
                    
                    do{
                        System.out.println("Nota N°: 5");
                        n5 = sc.nextInt();
                        notaIncorrecta = (n5 < 0 || n5 > 20);
                        if(notaIncorrecta){
                            System.out.println("Se ha introducido una nota incorrecta.");
                        }
                    } while(notaIncorrecta);
                    
                    do{
                        System.out.println("Nota N°: 6");
                        n6 = sc.nextInt();
                        notaIncorrecta = (n6 < 0 || n6 > 20);
                        if(notaIncorrecta){
                            System.out.println("Se ha introducido una nota incorrecta.");
                        }
                    } while(notaIncorrecta);
                    
                    notas = ""
                            +"Nota N° 1: "+n1+"           Nota N° 2: "+n2
                            +"\nNota N° 3: "+n3+"           Nota N° 4: "+n4
                            +"\nNota N° 5: "+n5+"           Nota N° 6: "+n6
                            +"";
                    
                    sumaNotas = (n1+n2+n3+n4+n5+n6);
                    promedio = (sumaNotas/6);
                    break;
                    
                case 3:
                    if(promedio >= 11.5){
                        System.out.println("El alumno está aprobado.");
                        condicion = "Aprobado";
                        mensaje = "¡Felicidades, sigue así!";
                    } else{
                        System.out.println("El alumno está desaprobado.");
                        condicion = "Desaprobado";
                        mensaje = "¡Sigue practicando, no te desanimes!";
                    }
                    break;
                    
                case 4:
                    System.out.println("");
                    System.out.println("#####################################");
                    System.out.println("#        *RESUMEN DE ALUMNO*        #");
                    System.out.println("#####################################");
                    System.out.println("Nombre: "+nombre);
                    System.out.println("Apellido: "+apellido);
                    System.out.println("#####################################");
                    System.out.println(""+notas);
                    System.out.println("Condición: "+condicion);
                    System.out.println("#####################################");
                    System.out.println(""+mensaje+"");
                    System.out.println("#####################################");
                    System.out.println("");
                    break;
                    
                case 5: break;
                
                default: System.out.println("Opción inválida.");
                    
            }
            if (opcion == 5) {
                System.out.println("Finalizando...");
                break;
            }
        }
    }
}