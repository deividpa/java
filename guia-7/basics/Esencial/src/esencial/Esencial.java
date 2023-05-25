/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esencial;

import java.util.Scanner;

/**
 *
 * @author trabajo
 */
public class Esencial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
            dos. El programa deberá después mostrar el resultado de la suma*/
        int num1, num2, total;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer entero a sumar");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo entero a sumar");
        num2 = leer.nextInt();
        System.out.println("El total es: " + (num1 + num2));
    }
    
}
