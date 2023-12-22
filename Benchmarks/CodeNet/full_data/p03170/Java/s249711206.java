import java.util.*;
import java.io.*;

public class Main {
  
  static int n, k;
  static int[] arr;
  static int[][] dp;
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    n = in.nextInt();
    k = in.nextInt();
    arr = new int[n];

    for (int i = 0; i < n; ++i) {
      arr[i] = in.nextInt();
    }  
    boolean[] firstWin = new boolean[k + 1];
    // firstWin[0] = true;
    for(int i = 1; i <= k; ++i) {
      for(int j = 0;j < n; ++j) {
        if(i - arr[j] >= 0 && !firstWin[i - arr[j]]) {
          firstWin[i] = true;
        }
      }
    }
    System.out.println(firstWin[k] ? "First": "Second");
    // dp = new int[k + 1][3];

    // int winner = dp(1, k);
    // System.out.println(winner == 1 ? "First" : "Second");
  }

  static int dp(int turn, int k) {
    if (k == 0) return turn == 2 ? 1 : 2;

    if (dp[k][turn] != 0) return dp[k][turn];

    boolean winning = false;
    for (int i = 0; i < n; ++i) {
      if (arr[i] <= k) {
        int t = dp(turn == 2 ? 1 : 2, k - arr[i]);
        if (t == turn) {
          winning = true; 
          break;
        }
      }
    }

    if (winning) return dp[k][turn] = turn ;
    else return dp[k][turn] = (turn == 2 ? 1 : 2);
  }

}