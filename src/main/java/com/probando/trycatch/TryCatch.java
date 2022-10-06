/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.probando.trycatch;
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Admn
 */
public class TryCatch {

    public static void main(String[] args) {
        /*int numero1;
        while(true){
        try {
            Scanner num = new Scanner(System.in);
            numero1 = num.nextInt();
        }catch (InputMismatchException e) {
            Scanner num = new Scanner(System.in);
            System.out.println("No es un número");
            numero1 = num.nextInt();
            continue;
        }
        }*/
         
        
        
        
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
