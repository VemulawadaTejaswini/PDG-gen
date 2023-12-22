import java.util.*;
import java.io.*;

class Main {




  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int N = in.nextInt();
    int W = in.nextInt();
    int[] w = new int[N];
    int[] v = new int[N];
    for (int i = 0; i < N; i++) {
      w[i] = in.nextInt();
      v[i] = in.nextInt();
    }

    int[] dp = new int[W + 1];
    for (int i = 0; i < N; i++) {
      for (int j = W; j >= w[i]; j--) {
        dp[j] = Math.max(dp[j], dp[j - w[i]] + v[i]);
      }
    }

    


    System.out.println(dp[W]);
  }

  

  
}