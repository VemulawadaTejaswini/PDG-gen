import java.util.*;
import java.io.*;

public class Main {
   public static void main(String[]abc) {
      Main ans = new Main();
      long solution = ans.solve();
      System.out.println(solution);
   }
  
   private long solve() {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int [] dp = new int[3];
      int best_a=0, best_b=0, best_c=0;
      for(int i=0;i<N;i++){
		    best_a = sc.nextInt();
            best_b = sc.nextInt();
            best_c = sc.nextInt(); 
         if (i!=0) {
            best_a = Math.max(best_a, Math.max(dp[1], dp[2]));
            best_b = Math.max(best_b, Math.max(dp[0], dp[2]));
            best_c = Math.max(best_c, Math.max(dp[1], dp[0]));
         }
         dp[0] = best_a;
         dp[1] = best_b;
         dp[2] = best_c;        
      }
      return Math.max(dp[0], Math.max(dp[1], dp[2]));
      
   }
}
