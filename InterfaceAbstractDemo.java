interface Vehicle {
    void start();
}

abstract class Car implements Vehicle {
    abstract void fuelType();
}

class Tesla extends Car {
    public void start() {
        System.out.println("Tesla starts silently!");
    }

    public void fuelType() {
        System.out.println("Tesla runs on electricity.");
    }
}

public class InterfaceAbstractDemo {
    public static void main(String[] args) {
        Tesla myCar = new Tesla();
        myCar.start();
        myCar.fuelType();
    }
}
