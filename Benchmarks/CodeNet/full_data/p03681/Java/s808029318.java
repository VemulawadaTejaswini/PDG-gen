import static java.lang.System.out;
import java.util.Scanner;
import java.util.Arrays;
public class Main{
   public static void main(String[]aa){
      Scanner sc = new Scanner(System.in); 
      int N = sc.nextInt();
      int M = sc.nextInt();
      int max = 1000000007;
 
      if(Math.abs(N-M)>1){
         out.println(0);
      }else{
            N = getFactional(N);
            M = getFactional(M);
 
            if(Math.abs(N-M) ==0){
               long data = (N*M)*2;
               out.println(data%max); 
            }else{
               long data = (N*M);
               out.println(data%max); 
         }
      }
      sc.close();
   }
   public static int getFactional(int n){
      
      if(n == 0){
         return 1;
      }else{
         
         return n * getFactional(n-1);
      }
   }
}