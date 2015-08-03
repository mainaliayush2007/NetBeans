import java.util.*;
public class SwitchCaseDay {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        String d;
        System.out.println("Enter a number from 1 to 7");
        int day=inp.nextInt();
        switch (day){
            case 1:
                d="Sunday";
                break;
                
            case 2:
                d="Monday";
                break;
                
            case 3:
                d="Tuesday";
                break;
            case 4:
                d="Wednesday";
                break;
            case 5:
                d="Thurday";
                break;
             case 6:
                d="Friday";
                break;
             case 7:
                d="Saturday";
                break;
             default:
                 d="Invalid Entry";
        }
        System.out.println(d);
        
    }
    
}
