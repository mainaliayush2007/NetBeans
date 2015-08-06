import java.util.*;
public class ArrayUserDefined {

    

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the row and column size of array");
        int r=Integer.parseInt(inp.nextLine());
        int c=Integer.parseInt(inp.nextLine());
        String name[][]=new String[r][c];
        int tot=r*c;
        System.out.println("Enter "+tot+" elements");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                //System.out.println("Enter the"+i+" "+j+" index element ");
                name[i][j]=inp.nextLine();
            }
        }
        System.out.println("The elements that you entered are");
        for(int k=0;k<r;k++){
            for(int l=0;l<c;l++){
                System.out.println("name["+k+"]["+l+"]="+name[k][l]);
                
            }
        }
    }
    
}

