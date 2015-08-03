import java.util.*;
public class CheckingVowels {
 
    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        System.out.println("Enter a character");
        String ch=inp.nextLine();
        if((ch.equalsIgnoreCase("a"))||(ch.equalsIgnoreCase("e"))||(ch.equalsIgnoreCase("i"))||(ch.equalsIgnoreCase("o"))||(ch.equalsIgnoreCase("u"))){
            System.out.println("It is vowel");
        }
        else{
            System.out.println("It is consonant");
        }
        
    }
    
}
