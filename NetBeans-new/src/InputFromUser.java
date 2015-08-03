import java.util.Scanner;
public class InputFromUser {
    Scanner sc= new Scanner(System.in);
    public static void main(String args[]){
      InputFromUser ifn=new InputFromUser();
      ifn.getData();
        
    }
    
    public void getData(){
        
        System.out.println("Enter your name");
        String name=sc.nextLine();
        System.out.println("Enter your Address");
        String address=sc.nextLine();
        String inf=showData(name,address);
        System.out.println(inf );
        
    }
    
    public String showData(String n, String add){
        String info="My Name is "+n+" and i live in "+add+".";
        return info;
        
    }
}
