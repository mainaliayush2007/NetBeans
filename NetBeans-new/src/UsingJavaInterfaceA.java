import java.util.*;
public class UsingJavaInterfaceA implements UsingJavaInterface {
    Scanner inp=new Scanner(System.in);
    public static void main(String[] args) {
        
        UsingJavaInterfaceA ujia=new UsingJavaInterfaceA();
        ujia.add();
        
    }

    @Override
    public void add() {
        System.out.println("Enter two numbers");
        int n1=inp.nextInt();
        int n2=inp.nextInt();
        System.out.println("The sum is " +(n1+n2));
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sub() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void multi() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void div() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
