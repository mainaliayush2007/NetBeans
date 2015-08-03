import java.io.*;
public class UsingInputStream {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader bf=new BufferedReader(isr);
        System.out.println("Enter name");
        String name=bf.readLine();
        System.out.println("Enter your age");
        int age=Integer.parseInt(bf.readLine());
        System.out.println("Name = "+name+"\nAge = "+age);
    }
    
}
