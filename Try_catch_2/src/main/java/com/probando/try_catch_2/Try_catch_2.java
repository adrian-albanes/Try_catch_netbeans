/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.probando.try_catch_2;
import java.util.*;
/**
 *
 * @author Admn
 */
public class Try_catch_2 {
/**
 * ArithmeticException: Se lanza cuando se ha producido una condición excepcional en una operación aritmética.
 * 
ArrayIndexOutOfBoundsException: Se lanza para indicar que se ha accedido a una matriz con un índice ilegal. El índice es negativo o mayor o igual que el tamaño de la matriz.
* 
ClassNotFoundException: Esta excepción se genera cuando intentamos acceder a una clase cuya definición no se encuentra
* 
FileNotFoundException: Esta excepción se genera  cuando un archivo no es accesible o no se abre.
* 
IOException: Se lanza cuando una operación de entrada-salida falla o se interrumpe
* 
InterruptedException: Se lanza cuando un hilo está esperando, durmiendo o realizando algún procesamiento y se interrumpe.
* 
NoSuchFieldException: Se lanza cuando una clase no contiene el campo (o variable) especificado
* 
NoSuchMethodException: Se lanza al acceder a un método que no se encuentra.
* 
NullPointerException: Esta excepción se genera cuando se hace referencia a los miembros de un objeto nulo. Nulo no representa nada
* 
NumberFormatException: Esta excepción se genera  cuando un método no puede convertir una string en un formato numérico.
* 
RuntimeException: Representa cualquier excepción que se produzca durante el tiempo de ejecución.
* 
StringIndexOutOfBoundsException: Lo lanzan los métodos de la clase String para indicar que un índice es negativo o mayor que el tamaño de la string
* 
* InputMismatchException: Cuando no se ingresan números, sabiendo que pertenece a tipo de dato numérico.
* https://es.acervolima.com/tipos-de-excepcion-en-java-con-ejemplos/ <-- Para ver ejemplos
* 
 * @param args 
 */
    public static void main(String[] args) {
        
        int numero;
        Scanner num = new Scanner (System.in);
        numero = num.nextInt();
        if (numero < 18) {
            throw new ArithmeticException("Acceso denegado, debe ser un número mayor que 18"); 
        } else {
            System.out.println("Correcto, ingrese a su sistema"); 
        }
        
        int numero1, numero2, resultado;
        String st;
        boolean val = true;
        boolean val2 = true;
        while(val){    
        try {
            Scanner num = new Scanner(System.in);
            System.out.print("Ingrese el primer número: ");
            numero1 = num.nextInt();
            System.out.print("Ingrese el segundo número: ");
            numero2 = num.nextInt();
            resultado = numero1/numero2;
            val = false;
        }catch (InputMismatchException e) {  //Para mostrar en pantalla que debe ingresar un número
            System.out.println("No es un número");
            val = true;
        }catch(ArithmeticException ex){
            System.out.println("El valor no debe ser nulo");
            val = true;
        }
        }
        while(val2){    
        try {
            Scanner str = new Scanner(System.in);
            System.out.print("Ingrese una palabra: ");
            st = str.next();
            val = false;
        }catch (NumberFormatException e) {  //Para mostrar en pantalla que debe ingresar un número
            System.out.println("No es un número");
            val = true;
        }
        }
         
        try{
            //Bloque de códigos de prueba
        }catch (Exception e){
            //Bloque de códigos para manejar errores
        }
        
        
       
Scanner input = new Scanner(System.in);
int exampleInput = 0;
do {
    try {
        System.out.print("\nIngrese solo números: ");
        exampleInput = input.nextInt();
    }
    catch (InputMismatchException e) { //if an exception appears prints message below
        System.err.println("Wrong input! Enter an integer from 1 to 25");
        input.next(); // Clear scanner buffer of wrong input
    }
} while (exampleInput < 1 || exampleInput > 25);
        System.out.println("Print exampleInput: " + exampleInput);
        
    
    }    
    }
