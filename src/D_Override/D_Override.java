package D_Override;

public class D_Override {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(6);
        vehicle.getWheels();
        vehicle.getColor();

        Car car = new Car();
        car.getWheels();
        car.getColor();
        car.getsample();


        float numFloat=34.1f;
        int numInt=(int) numFloat;
        System.out.println(numInt);
    }
}
