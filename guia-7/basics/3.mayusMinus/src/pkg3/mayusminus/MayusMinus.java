package pkg3.mayusminus;

import java.util.Scanner;

/**
 *
 * @author David Pérez
 */
public class MayusMinus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
            en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.*/
        String frase, fraseMin, fraseMayus;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase para convertir en mayúscula y minúscula");
        frase = leer.nextLine();
        fraseMin = frase.toLowerCase();
        fraseMayus = frase.toUpperCase();
        System.out.println("Frase en minúsculas: " + fraseMin);
        System.out.println("*********************************************");
        System.out.println("Frase en mayúsculas: " + fraseMayus);
    }
    
}
