package exercici5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
Exercici 5
    A aquesta activitat hem de dissenyar un programa amb dos mètodes. Un
    mètode "llegir" haurà d'imprimir per pantalla el contingut per pantalla d'un fitxer local
    (totes les línies). L'altre mètode "escriure" haurà d'escriure el text introduït per
    pantalla al final d'un fitxer donat.
*/
public class Exercici5 {
    private static File path = new File(System.getProperty("user.dir"));

    public static void main(String[] args) throws IOException {
        //String texto = "\n Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut quis felis ac urna sagittis pellentesque. Quisque non enim feugiat, hendrerit diam eu, dictum velit. Sed vehicula, nulla eu commodo faucibus, sem ex iaculis ipsum, sed viverra felis lectus condimentum risus.";
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el texto que quieres añadir al documento");
        String texto = sc.nextLine();
        escribirDocumento("\n" + texto);
        leerDocumento();
    }

    public static void leerDocumento() throws FileNotFoundException {
        File documento = new File(path,"documento.txt");
        Scanner sc = new Scanner(documento);
        while (sc.hasNextLine()) {
            String data = sc.nextLine();
            System.out.println(data);
        }
        sc.close();
    }

    public static void escribirDocumento(String texto) throws IOException {
        File documento = new File(path,"documento.txt");
        FileWriter fw = new FileWriter(documento, true);
        fw.write(texto);
        fw.close();
    }
}
