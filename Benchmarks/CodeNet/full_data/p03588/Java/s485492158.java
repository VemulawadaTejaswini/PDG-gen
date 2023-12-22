import static java.lang.System.out;
import java.util.Scanner;
import java.util.Arrays;
public class Main{
   public static void main(String[]aa){
      Scanner sc = new Scanner(System.in); 
      int N = sc.nextInt();
      int[][] array = new int[N][2];
      Scanner sct = new Scanner(System.in);
      String[][] st = new String[N][2];
      for(int i=0;i<N;i++){
            st[i] = sct.nextLine().split(" ");
            for(int j=0;j<2;j++){
                  array[i][j] = Integer.parseInt(st[i][j]);
            }
      }
      int max =0;
      int min =Integer.MAX_VALUE;
      for(int i=0;i<N-1;i++){
          min = Math.min(Math.min(array[i][1],array[i+1][1]),min);
          max = Math.max(Math.max(array[i][0],array[i+1][0]),max);
      }
      
      out.println(max+min);

      sc.close();
   }
  
}