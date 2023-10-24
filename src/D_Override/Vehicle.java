package D_Override;

public class Vehicle {
    public Vehicle() {
        System.out.println("called");
    }

    public Vehicle(int a) {
        System.out.println("constructor" +a);
    }

    protected int wheels = 4;

    void getColor() {
        System.out.println("Green");
    }

    void getWheels() {
        System.out.println("Wheels -" + wheels);
    }
}
