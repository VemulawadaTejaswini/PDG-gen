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
         N = getFactional(N,max);
         M = getFactional(M,max);
         long data= 0;
         if(Math.abs(N-M) ==0){
            data = (N*M)*2;
         }else{
            data = (N*M);
         }
         out.println(data%max);
      }
      sc.close();
   }
   //階乗を求める
   // public static int getFactional(int n){
   //    if(n == 0){
   //       return 1;
   //    }else{
   //       return n * getFactional(n-1)%1000000007;
   //    }
   // }
   public static int getFactional(int n,int max){
      int result = 1;
      for(int i=1;i<n+1;i++){
         result = ((i%max)*result)%max;
      }
      return result;
   }
}