// Explain the concept of encapsulation with a suitable example.
class Student {
    private String name;
    private int rollNumber;
    private double marks;

    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNumber + ", Marks: " + marks);
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Student student = new Student("Rahul", 101, 85.5);
        student.display();
    }
}
