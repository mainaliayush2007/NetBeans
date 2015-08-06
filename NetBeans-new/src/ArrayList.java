
import java.util.*;


public class ArrayList {
    public static void main(String[] args) {
        String arr[]={"ram","hari","gita"};
        if(Arrays.asList(arr).contains("gita")){
            System.out.println("Gita is there in array");
        }
        else{
            System.out.println("Gita is not present in array");
        }
    }
    
}
