package pkg4.conversorfahrenheit;

import java.util.Scanner;

/**
 *
 * @author David Pérez
 */
public class ConversorFahrenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
            Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).*/
        double tempCelsius, tempFahren;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en celsius");
        tempCelsius = leer.nextDouble();
        tempFahren = 32 + (9 * tempCelsius / 5);
        System.out.println(tempCelsius + "°C - Coresponden a: " + tempFahren + "°F");
    }
    
}
