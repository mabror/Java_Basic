package Main.DataTypes;

public class Foreachloop {
    public static void main(String[] args){

        // for-each = traversing technique to iterate through the elements in an array/colllection
        //             less steps, more readable
        //             less flexible

    
    String[] animals = {"cat", "dog", "rat", "bird"};

    for(String i : animals){
        System.out.println(i);
    }

    }
}
