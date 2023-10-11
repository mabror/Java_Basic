package Main.Methods;

public class Method {
    public static void main(String[] args){
        // mehod = a block of code that is executed whenever it is called upon
        int x = 3;
        int y = 5;
        System.out.println(add(x, y));
    }
    static int add(int x, int y) {
        int z = x + y;
        return z;
    }
    // static void hello(String name, int age) {
    //     System.out.println("Hello "+name+ " you re " + age);
    // }
}
