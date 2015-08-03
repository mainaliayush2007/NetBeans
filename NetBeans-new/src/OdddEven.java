import java.util.*;
public class OdddEven {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter a number");
        int n1=inp.nextInt();
        if(n1==0){
            System.out.println("Enter other number expect 0");
        }
        else{
            if(n1%2==0){
                System.out.println("It is even");
            }
            else{
                System.out.println("It is odd");
            }
        }
    }
}
