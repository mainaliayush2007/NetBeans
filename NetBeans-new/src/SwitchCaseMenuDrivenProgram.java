import java.util.*;
public class SwitchCaseMenuDrivenProgram {
    public static void main(String[] args) {
        double n1,n2,res=0;
        Scanner inp=new Scanner(System.in);
        System.out.println("1.Addition\n2.Substraction\n3.Division\n4.Multiplication\nEnter your choice");
        int ch=inp.nextInt();
        if (ch>=1&&ch<=4){   
        System.out.println("Enter two number");
        n1=inp.nextDouble();
        n2=inp.nextDouble();
        switch (ch){
            case 1:
                res=n1+n2;
                
                break;
            case 2:
                res=n1-n2;
               
                break;
            case 3:
                res=n1/n2;
                
                break;
            case 4:
                res=n1*n2;
                
                break;
            
        }
        System.out.println("The result is " +res);
        }
        else
            System.out.println("Invalid entry");
        
    }
    
}
