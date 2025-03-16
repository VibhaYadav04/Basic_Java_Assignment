//Create a class to represent a student with attributes like name, roll number, and marks.
//Implement inheritance to create a "GraduateStudent" class that extends the "Student" class with additional features.

class Student {
    String name;
    int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNumber);
    }
}

class GraduateStudent extends Student {
    String specialization;

    public GraduateStudent(String name, int rollNumber, String specialization) {
        super(name, rollNumber);
        this.specialization = specialization;
    }

    public void display() {
        super.display();
        System.out.println("Specialization: " + specialization);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        GraduateStudent gradStudent = new GraduateStudent("Amit", 102, "Computer Science");
        gradStudent.display();
    }
}
