import java.util.*;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=inp.nextLine();
        switch (name.toLowerCase()){
            case "ayush":
                System.out.println("Teacher");
                break;
            case "aashish":
                System.out.println("Student");
                break;
            case "ram":
                System.out.println("Peon");
                break;
            default:
                System.out.println("You are nobody");
        }
    }
    
}
