import java.util.*;
public class Ludo {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        Random dice=new Random();
        System.out.println("Enter Number of players");
        int n=Integer.parseInt(inp.nextLine());//Important
        int score[]=new int[n];
        String[] name=new String[20];
        
        for(int i=0;i<n;i++){
            System.out.println("Enter the "+(i)+ " player's name");
            name[i]=inp.nextLine();
        }
        for(int i=0;i<n;i++){
            System.out.println(name[i]+" hit enter to roll the dice");
            String check=inp.nextLine();
            score[i]=dice.nextInt(6);
            score[i]++;
           
        }
        
        for(int i=0;i<n;i++){
            
            System.out.println("\n"+name[i]+" Score= "+score[i]);
        }
        
    }
    
}
