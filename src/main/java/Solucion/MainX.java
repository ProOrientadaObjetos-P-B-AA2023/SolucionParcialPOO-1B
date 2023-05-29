package Solucion;
class Student {
    private String name;
    private int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
class Classroom {
    private Student[] students;
    public Classroom(Student[] students) {
        this.students = students;
    }
    public Student findOldestStudent() {
        Student oldestStudent = students[0];
        for (int i = 1; i < students.length; i++) {
            if (students[i].getAge() > oldestStudent.getAge()) {
                oldestStudent = students[i];
            }
        }
        return oldestStudent;
    }
}
public class MainX {
    public static void main(String[] args) {
        Student student1 = new Student("John", 18);
        Student student2 = new Student("Emma", 20);
        Student student3 = new Student("Michael", 19);
        Student student[] = {new Student("Michael", 19), new Student("Emma", 20), new Student("Michael", 19)};
        Student[] students = {student1, student2, student3};
        Classroom classroom = new Classroom(student);
        Student oldestStudent = classroom.findOldestStudent();
        System.out.println("El estudiante más viejo es: " + oldestStudent.getName());
    }
}