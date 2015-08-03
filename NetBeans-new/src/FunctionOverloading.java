import java.util.*;
public class FunctionOverloading {
    public void area(double rad){
        System.out.println("The area of the circle is "+(3.14*rad*rad));
       
        
    }
    public void area(float len,float bre){
        System.out.println("The area of rectangle is "+(len*bre));
       
        
    }
    
    public void area(double base,double ht){
        System.out.println("The area of the triangle is "+((base*ht)/2));
        
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        FunctionOverloading fun=new FunctionOverloading();
        System.out.println("Enter the radius of the circle");
        double r=inp.nextDouble();
        fun.area(r);
        System.out.println("Enter the length and breadth of the rectangle");
        float l=inp.nextFloat();
        float b=inp.nextFloat();
        fun.area(l, b);
        
        System.out.println("Enter the base and height of the triangle");
        double ba=inp.nextDouble();
        double h=inp.nextDouble();
        fun.area(ba, h);
        
    }
}
