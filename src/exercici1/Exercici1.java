package exercici1;
/*
Exercici 1
    A aquest programa hem de definir dos nombre enters amb el valor que vulgueu
    vosaltres. Per pantalla hem de mostrar la suma, la resta, la multiplicació i la divisió
    d'aquests dos nombres. (Una línia per cada resultat.)
*/
public class Exercici1 {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 10;
        System.out.println("La suma es: " + (num1 + num2)
                + "\nLa resta es: " + (num1 - num2)
                + "\nLa multiplicaicon es: " + (num1 * num2)
                + "\nLa division es: " + (num1 / num2));
    }
}
