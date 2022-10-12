package exercici2;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String nombre;
    private List<Integer> notas = new ArrayList<Integer>();

    public Alumno(String nombre, List<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public double getNotaMedia(Alumno alumno) {
        long sum = 0;
        for (int i: alumno.getNotas()) {
            sum += i;
        }
        return alumno.getNotas().size() > 0 ? (double) sum / alumno.getNotas().size() : 0;
    }

    public Alumno(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Integer> getNotas() {
        return notas;
    }

    public void setNotas(List<Integer> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "\n Alumno: " + nombre + ", " + " notas = " + notas;
    }
}
