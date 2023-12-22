import java.util.*;
import java.*;
class Main {
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int     N    = scan.nextInt();
      int     K    = scan.nextInt();



      if(K == 0){
         System.out.println(N * N);
         return;
         }

      long count = 0;
      for(long i = K + 1; i <= N; i++){
          long p = N / i;
          long r = N % i;
          count += (i - K) * p + Math.max(r - K + 1, 0);
          }


      System.out.println(count);
   }
}
