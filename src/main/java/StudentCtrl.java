package pe.edu.tecsup.lab01;

import java.util.ArrayList;
import java.util.List;

public class StudentCtrl {

    private List<String> estudiantes;

    public StudentCtrl() {
        estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(String nombre) {
        estudiantes.add(nombre);
        System.out.println(nombre + " agregado correctamente.");
    }

    public void listarEstudiantes() {
        System.out.println("Lista de estudiantes:");
        for (String e : estudiantes) {
            System.out.println("- " + e);
        }
    }
}