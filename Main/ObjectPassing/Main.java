package Main.ObjectPassing;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();

        Car car1 = new Car("BMW");
        Car car2 = new Car("Tesa");
        garage.park(car2);
        garage.park(car1);
    }
}
