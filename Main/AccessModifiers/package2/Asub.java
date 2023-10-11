package Main.AccessModifiers.package2;

import Main.AccessModifiers.package1.A;

public class Asub extends A{
    public static void main(String[] args) {
        
        Asub  asub = new Asub();
        System.out.println(asub.prMessaj);  // this protected visible for subclass 
        C c = new C();
        // System.out.println(c.defaultMessage);   Thats visible because is default + in the same package
    }
}
