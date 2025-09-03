package maratonajava.weslei.cursodev;

public class SwitchCase {
    public static void main(String[] args) {
        //Learning how to use Switch Case

        String name = "Weslei";

        //Accepted types --> char, int, short, String, enum, byte
        switch (name) {
            case "Weslei": 
                System.out.println("Valid user, welcome!");
                break;
            default:
                System.out.println("Invalid user!");
                break;
        }
    }
}
