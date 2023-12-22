import java.util.*;
import java.io.*;

class Main {

  

  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    
    int N = in.nextInt();
    long[] a = new long[N];
    for (int i = 0; i < N; i++) {
      a[i] = in.nextInt();
    }

    

    long[] dp = new long[N];
    for (int i = 0; i < N; i++) {
      dp[i] = a[i];
    }

    for (int i = 1; i < N; i++) {
      a[i] += a[i - 1];
    }

    for (int len = 2; len <= N; len++) {
      for (int i = 0; i < N; i++) {
        int j = i + len - 1; 
        if (j >= N) {break;}
        dp[i] = a[j] - (i == 0 ? 0 : a[i - 1]) - Math.min(dp[i + 1], dp[i]);
      }
    }




    System.out.println(2 * dp[0] - a[N - 1]);
  }

}
