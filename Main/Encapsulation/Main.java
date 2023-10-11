package Main.Encapsulation;

public class Main {
    public static void main(String[] args){
        // Encapsulation = attributes of a class will be hidden or private,
        //                 Can be accessed only through methods (getters & setters)
        //                 You should make attributes private if you dont have a reason to make them public/protected
    
        Car car = new Car("Chevrolet", "camaro", 2021);

        

        // car.make = 2023;  cannot be accesed to private
        car.setMake("Tesla");

        // System.out.println(car.make);  cannot access that private variable
        System.out.println(car.getMake());
    }     
}
