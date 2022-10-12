package exercici6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Exercici 6
    Escriu un programa que vagi guardant els nombres que vagi introduint
    l’usuari en dues llistes (nombres senars i nombres parells). Quan l’usuari vulgui
    aturar introduirà el valor “E”. Per finalitzar, el programa ha de mostrar els valors
    resultants dels dos vectors.
*/
public class Exercici6 {
    public static void main(String[] args) {
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        String aux;
        int numero;

        while(!exit)
        {
            System.out.println("¿Desea ingresar un numero? Introduce E para salir");
            aux = sc.nextLine();
            if (aux.equals("e") || aux.equals("E")) {
                exit = true;
            }
            else {
                try {
                    numero = Integer.parseInt(aux);
                    Boolean par = numero % 2 == 0?pares.add(numero):impares.add(numero);
                } catch (NumberFormatException e) {
                    System.out.println("ERROR: " + aux + " no es un numero");
                    throw new RuntimeException(e);
                }
            }
        }
        System.out.println("Numeros pares: \n" + pares);
        System.out.println("Numeros impares: \n" + impares);
    }
}
