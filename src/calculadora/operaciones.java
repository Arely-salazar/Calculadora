/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Jairo
 */
public class operaciones {
    
    //atributos
     private int resultado;
     
    //constructor vacio 
     public operaciones() {
    }
     //constructor y asignación de valores

    public operaciones(int resultado) {
        this.resultado = resultado;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }   
    //agregar el metodo y clases de suma para imprimir
     public int suma (int num1, int num2) {
         this.resultado =  num1 + num2;
         return resultado;
    }
    //metodo resta
     public int resta (int num1, int num2) {
         this.resultado = num1 - num2;
         return resultado;
    } 
    //metodo multiplicación
      public int multiplicacion (int num1, int num2) {
         this.resultado = num1 * num2 ;
         return resultado;
    }
    //metodo división
       public int division (int num1, int num2) {
            int resultado = 0;
         this.resultado = num1 / num2;
         return resultado;
    }
    //metodo  para imprimir
    @Override
    public String toString() {
        return "operaciones{" + "resultado=" + resultado + '}';
    }
   
}
