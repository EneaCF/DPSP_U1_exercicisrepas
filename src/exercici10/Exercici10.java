package exercici10;
/*
Exercici 10
    Escriu un programa que donat un text. Compti totes les paraules que
    tinguin més de 10 lletres.
*/
public class Exercici10 {
    private static final int numLetras = 10;
    public static String palabrasRequisito;

    public static void main(String[] args) {
        String texto = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus iaculis urna vitae nulla rutrum hendrerit sit amet id velit. Aliquam condimentum lacus id sollicitudin euismod. Vestibulum justo lectus, accumsan auctor tortor rutrum, euismod viverra nibh. Mauris varius pellentesque mattis. Quisque vestibulum non risus sodales eleifend.";
        System.out.println("El texto contiene " + contarLetras(texto) + " palabras con " + numLetras + " o mas letras");
        System.out.println("Las palabrasa que cumplen los requisitos son: \n" + palabrasRequisito);
    }
    public static int contarLetras(String texto){
        int contador = 0;
        String palabras[] = texto.split(" ");
        for (String palabra : palabras) {
            if(palabra.length() >= numLetras){
                palabrasRequisito += palabra + ", ";
                contador++;
            }
        }
        return contador;
    }
}
