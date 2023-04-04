
import java.util.*;
public class Arrays{
    public static void main(String args[]){
        int[][]A=new int[5][4];
      Scanner sc=new Scanner(System.in);
      int rows=sc.nextInt();
      int columns=sc.nextInt();
      int[][] number= new int[rows][columns];
      for(int i=0;i<rows;i++){
        for(int j=0;i<columns;j++){
        number[i][j]=sc.nextInt();
        }
      }

      //Display output
      for(int i=0;i<rows;i++){
        for(int j=0;i<columns;j++){
            System.out.println(number[i][j]);
        }
        System.out.println();
      }

    }
    
}
