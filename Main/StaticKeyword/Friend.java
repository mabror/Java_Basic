package Main.StaticKeyword;

public class Friend {
    String name;
    static int numberofFriends;

    Friend(String name) {
        this.name = name;
        numberofFriends++;
    }
    static void dispayFriends() {
        System.out.println("U have " +numberofFriends);
    }
}
