import java.util.*;
public class Polymorphism {
    public int add(int a,int b){
        return(a+b); 
    }
    public double add(double a, double b){
        return(a+b);
    }
    
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        Polymorphism p=new Polymorphism();
        System.out.println("Enter two integer numbers");
        int n1=inp.nextInt();
        int n2=inp.nextInt();
        int res=p.add(n1,n2);
        System.out.println("Enter two double");
        double d1=inp.nextDouble();
        double d2=inp.nextDouble();
        double dres=p.add(d1,d2);
        System.out.println("The sum of two integer no is "+res+" the sum of two double is "+dres);
        
        
    }
        
    
}
