package pe.edu.tecsup.lab01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentView {

    private List<StudentModel> students = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // Método para agregar un estudiante
    public void addStudent() {
        System.out.print("ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nombre: ");
        String name = scanner.nextLine();
        System.out.print("Edad: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Nota: ");
        double grade = Double.parseDouble(scanner.nextLine());

        students.add(new StudentModel(id, name, age, grade));
        System.out.println("Estudiante agregado correctamente.\n");
    }

    // Método para mostrar estudiantes usando StudentReport
    public void showStudents() {
        StudentReport report = new StudentReport();
        report.printReport(students);
    }
}