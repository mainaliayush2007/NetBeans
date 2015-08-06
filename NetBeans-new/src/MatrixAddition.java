import java.util.*;
public class MatrixAddition {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the row and column size of the matrix");
        int r=Integer.parseInt(inp.nextLine());
        int c=Integer.parseInt(inp.nextLine());
        int arr1[][]=new int[r][c];
        int arr2[][]=new int[r][c];
        int arr3[][]=new int[r][c];
        System.out.println("Enter "+(r*c)+" elements for first matrix");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                
                arr1[i][j]=inp.nextInt();
        }
        }
        System.out.println("Enter "+(r*c)+" elements for second matrix");
        for(int k=0;k<r;k++){
            for(int l=0;l<c;l++){
                
                arr2[k][l]=inp.nextInt();
        }
    }
       for(int m=0;m<r;m++){
            for(int n=0;n<c;n++){
                
           
                arr3[m][n]=arr1[m][n]+arr2[m][n];
        }
    }
        System.out.println("The new matrix is");
        for(int o=0;o<r;o++){
            for(int p=0;p<c;p++){
                
           
                System.out.print(arr3[o][p]+"\t");
        }
            System.out.println("");
    }
        
    
}
}

