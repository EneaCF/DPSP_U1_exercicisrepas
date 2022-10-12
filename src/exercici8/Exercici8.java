package exercici8;
/*
Exercici 8
    Escriu un programa que calculi la potència d’un nombre utilitzant
    recursivitat.
*/
public class Exercici8 {
    public static void main(String[] args) {
        System.out.println(potencia(3,3));
        System.out.println(potencia(2,4));
        System.out.println(potencia(6,8));
    }
    public static double potencia(int base, int exponente){
        if (exponente == 0) {
            return 1;
        }
        else if (exponente < 0) { // Caso recursivo, si exponente es negativo, calculamos la inversa de si fuera positivo.
            return 1 / potencia(base, -exponente);
        }
        else { // Caso recursivo, base * base^(exponente-1)
            return base * potencia(base, exponente - 1);
        }
    }
}
