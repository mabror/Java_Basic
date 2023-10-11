package Main.Contructors;

public class Humans {
    int age;
    String name;
    double weight;
    Humans(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    void eat() {
        System.out.println(this.name+ " is eating");
    }
    void drink() {
        System.out.println(this.weight);
    }
}
