package pe.edu.tecsup.lab01;

import java.util.List;

public class StudentReport {

    // Método para mostrar listado de estudiantes
    public void printReport(List<StudentModel> students) {
        System.out.println("ID\tNombre\tEdad\tNota\tAprobado");
        for (StudentModel s : students) {
            System.out.printf("%d\t%s\t%d\t%.2f\t%s\n",
                    s.getId(), s.getName(), s.getAge(), s.getGrade(),
                    s.isPassed() ? "Sí" : "No");
        }
    }

    // Aquí se pueden agregar más métodos para generar reportes estadísticos
}