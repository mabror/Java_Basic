package Main.AccessModifiers.package2;

public class C {


    public String publicMessage = "THis is public";

    

    public static void main(String[] args) {

    Asub asub = new Asub();
    
    System.out.println(asub.prMessaj); // cant be accessed this protected message
    
    // String defaultMessage = "This is the default";
    }
}
