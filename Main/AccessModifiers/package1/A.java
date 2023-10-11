package Main.AccessModifiers.package1;
import Main.AccessModifiers.package2. *;

public class A {

    protected String prMessaj = "This is protected messaj";
    
    public static void main(String[] args) {
        // TODO  Auto-generated method sub

        

        C c = new C();
         
        System.out.println(c.publicMessage);
      
        // System.out.println(c.defaultMessage);   Thats not visible cause is default. That visible only in the same package
    }
}
