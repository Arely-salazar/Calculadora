/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
import java.util.Scanner;

public class Calculadora {

   
    public static void main(String[] args) {
        operaciones cal = new operaciones();
        Scanner entrada = new Scanner(System.in);
        boolean opc = true;
        while(opc){
            
        System.out.println("-----------------------------");
        System.out.println("Menu");
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicación");
        System.out.println("4.División");
        System.out.println("5.Salir");
        System.out.println("Seleccionar una opción: ");
        int opcion = entrada.nextInt();
        
        
        if (opcion ==5){
            System.out.println("Finalizo");
            break;
            
        } else {
            
            switch(opcion){
                case 1:
                    System.out.println("Ingrese el primer valor");
                    int num1 = entrada.nextInt();
                     System.out.println("Ingrese el segundo valor");
                    int num2 = entrada.nextInt();
                    int resultado = cal.suma(num1, num2);
                    System.out.println("La suma es: " + resultado);
                    break;
                    
                    
                case 2:
                    System.out.println("Ingrese el primer valor");
                     num1 = entrada.nextInt();
                     System.out.println("Ingrese el segundo valor");
                     num2 = entrada.nextInt();
                    resultado = cal.resta(num1, num2);
                    System.out.println("La resta es: " + resultado);
                    break;
                    
                case 3: 
                    System.out.println("Ingrese el primer valor");
                     num1 = entrada.nextInt();
                     System.out.println("Ingrese el segundo valor");
                     num2 = entrada.nextInt();
                     resultado = cal.multiplicacion(num1, num2);
                    System.out.println("La multipicación es: " + resultado);
                    
                    break;
                    
                    
                case 4:
                    System.out.println("Ingrese el primer valor");
                     num1 = entrada.nextInt();
                     System.out.println("Ingrese el segundo valor");
                     num2 = entrada.nextInt();
                     resultado = cal.division(num1, num2);
                    System.out.println("La división es: " + resultado);
                     break;
            }
            
        
        
            
        }
   
        }
    }
}


