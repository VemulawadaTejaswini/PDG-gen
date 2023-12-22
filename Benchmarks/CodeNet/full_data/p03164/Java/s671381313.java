import java.util.*;
import java.io.*;

class Item {
   int weight, val;
   public Item(int weight, int val) {
      this.weight = weight;
      this.val = val;
   }
}
public class Main {
  
  
  public static void main(String []abc) {
     Main sol = new Main();
	 long answer=sol.solve();
     System.out.println(answer);
  }
  
  private long solve() {
     Scanner sc = new Scanner(System.in);
     int N = sc.nextInt();
     int maxWeight = sc.nextInt();
     int maxValue = 1000*N;
     long [][] dp = new long[N+1][maxValue+1];
     long INF = (long) 1e9+1;
     for(int i=0;i<=maxValue;i++){
        dp[1][i] = INF;
     }
     Item []array = new Item[N+1];
     for(int i=1;i<=N;i++){
        array[i] = new Item(sc.nextInt(), sc.nextInt());
     }
     dp[1][array[1].val] = array[1].weight;
     dp[1][0] = 0;
     for(int i=2;i<=N;i++){
        for(int val=0;val<=maxValue;val++){
           dp[i][val] = dp[i-1][val];
           if (array[i].val > val) continue;
           dp[i][val] = Math.min( dp[i-1][val],
                                  dp[i-1][val-array[i].val]);
        }       
     }
     long bestVal=0;
     for(int i=0;i<=maxValue;i++){
        if (dp[N][i]<=maxWeight) bestVal = Math.max(bestVal, dp[N][i]);
     }
     return bestVal;
  }
}
