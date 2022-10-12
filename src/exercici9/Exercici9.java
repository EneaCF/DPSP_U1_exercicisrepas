package exercici9;

import java.util.Scanner;

/*
Exercici 9
    Escriu un programa que donat un nombre passat per teclat indiqui l'any,
    mes i dia corresponent. Tenint en compte que l'1 correspon al 1 de Gener de 2020.
    Suposarem que cada mes té 30 dies.
    Nota: com cada mes té 30 dies. Heu de tenir en compte que l’any serà de 360 dies.
    Exemple:
    Entrada     Sortida
    380         20 Gener 2021
    31          1 Febrer 2020
    1025        5 Octubre 2022
*/
public class Exercici9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero!");
        int num = sc.nextInt();
        int dia = 0; int mes = 0; int year = 2020;
        int diasMes = 30; int diasYear = 360;
        String meses[] = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

        year += num / diasYear;
        int auxYear = num % diasYear;
        mes = auxYear / diasMes;
        auxYear = auxYear % diasMes;
        if(auxYear == 0){
            dia = 1;
        }else {
            dia = auxYear;
        }
        System.out.println(dia + " " + meses[mes] + " " + year);
    }
}
