import java.util.*;
import java.io.*;

class Item {
   int weight,val;
   public Item(int weight, int val) {
      this.weight = weight;
      this.val = val;
   }
}

public class Main {
	
  public static void main(String[]abc) {
     Main ans = new Main();
     System.out.println(ans.solve());
  }
  
  private long solve() {
     Scanner sc = new Scanner(System.in);
     int N = sc.nextInt();
     int maxWeight = sc.nextInt();
     Item [] items = new Item[N+1];
     for(int i=1;i<=N;i++){
        items[i] = new Item(sc.nextInt(), sc.nextInt());
     }
     int maxVal = N * 1000;
     long [][] dp =new long[N+1][maxVal+1];
     long INF = (long) 1e9+7;
     for(int i=0;i<=N;i++) {
        Arrays.fill(dp[i], INF);
     }
     dp[1][items[1].val] = items[1].weight;
     dp[0][0] = 0;
    
     for(int i=1;i<=N;i++){
       for(int val=0;val<=maxVal;val++){
          dp[i][val] = dp[i-1][val];
          //System.out.printf("dp[%d][%d]: %d\n", i, val, dp[i][val]);
          if (items[i].val > val) continue;
          dp[i][val] = Math.min(dp[i-1][val], dp[i-1][val-items[i].val] + items[i].weight);
          //System.out.printf("\tdp[%d][%d]: %d\n", i, val, dp[i][val]);
       }
     }
     
     long answer =0;
     for(int val=0;val<=maxVal;val++){
        if (dp[N][val]<=maxWeight) answer = Math.max(answer, val);
     }
     return answer;
  }
}