/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.maths;

import java.util.Scanner;

/**
 *
 * @author trabajo
 */
public class Maths {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escribir un programa que lea un número entero por teclado y muestre por pantalla el
            doble, el triple y la raíz cuadrada de ese número.*/
        int num, doble, triple;
        double raiz;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el número a operar:");
        num = leer.nextInt();
        doble = num*2;
        triple = num*3;
        raiz = Math.sqrt(num);
        
        System.out.println("El doble de " + num + " es: " + doble);
        System.out.println("El triple de " + num + " es: " + triple);
        System.out.println("La raíz de " + num + " es: " + raiz);
    }
    
}
