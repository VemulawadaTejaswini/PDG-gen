import java.util.*;
import java.io.*;
 
class Main {
 
  static int INF = (int) 1e9 + 7;
 
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    
    int n = in.nextInt();
    int[][] can = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        can[i][j] = in.nextInt();
      }
    }

    
    int[] dp = new int[1 << n];
    dp[0] = 1;
    for (int mask = 0; mask < 1 << n; mask++) {
      int a = countSetBit(mask);
      for (int b = 0; b < n; b++) {
        if ((mask & 1 << b) == 0 && can[a][b] == 1){
          add(dp, mask | 1 << b, mask);
        } 
      }
    }
   
    System.out.println(dp[(1<<n) - 1]);
  }

  static void add(int[] a, int i, int j) {
    a[i] += a[j];
    if (a[i] >= INF) {a[i] -= INF;}
  }

  static int countSetBit(int a) {
    int count = 0; 
    while (a > 0) {
      count += (a & 1);
      a = a >> 1;
    }
    return count;
  }

 
}