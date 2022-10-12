package exercici2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Exercici 2
    A aquesta activitat hem de dissenyar un programa que et faci la mitjana de les
    notes d'un alumne, per a això el programa t'ha de sol·licitar el nom de l'alumne i les
    notes de les 3 avaluacions per pantalla i mostrar el resultat final.
*/
public class Exercici2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Alumno alumno = new Alumno();
        List<Integer> notas = new ArrayList<>();
        System.out.println("Introduce el nombre del alumno:");
        alumno.setNombre(sc.nextLine());
        System.out.println("Introduce la nota de la 1ª evaluacion de: " + alumno.getNombre());
        notas.add(sc.nextInt());
        System.out.println("Introduce la nota de la 2ª evaluacion de: " + alumno.getNombre());
        notas.add(sc.nextInt());
        System.out.println("Introduce la nota de la 3ª evaluacion de: " + alumno.getNombre());
        notas.add(sc.nextInt());

        alumno.setNotas(notas);

        System.out.printf("RESULTADO: " + alumno + ". La media es: %.2f\n", + alumno.getNotaMedia(alumno));

    }
}
