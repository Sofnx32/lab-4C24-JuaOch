package pe.edu.tecsup.lab01;

public class StudentModel {

    private int id;
    private String name;
    private int age;
    private double grade;

    // Constructor
    public StudentModel(int id, String name, int age, double grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public double getGrade() { return grade; }
    public void setGrade(double grade) { this.grade = grade; }

    // Método de ejemplo
    public boolean isPassed() {
        return grade >= 11; // supongamos que 11 es el mínimo aprobado
    }
}