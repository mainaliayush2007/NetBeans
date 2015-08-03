import java.util.*;
public class IfElse {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter two number");
        int n1=inp.nextInt();
        int n2=inp.nextInt();
        if(n1>n2){
            System.out.println(n1+ " is greater");
        }
        else if(n1==n2){
            System.out.println("Two number are equal");
        }
        else{
            
            System.out.println(n2+ " is greater");
        }
        
    }
    
}
