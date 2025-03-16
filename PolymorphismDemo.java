// Demonstrate polymorphism by creating methods with the same name but different parameters in a parent and child class.
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 10));      // Calls int method
        System.out.println(calc.add(5.5, 10.5));  // Calls double method
    }
}
