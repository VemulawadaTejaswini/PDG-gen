import java.util.*;

public class Main {
  private static final int INF = 1_000_000_000;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[][] S = new int[N][N];
    for (int i = 0; i < N; i++) {
      String s = sc.next();
      for (int j = 0; j < N; j++) {
        char c = s.charAt(j);
        if (c == '1') {
          S[i][j] = 1;
        } else if (i == j) {
          S[i][j] = 0;
        } else {
          S[i][j] = INF;
        }
      }
    }
    
    int[] v = new int[N];
    v[0] = 1;
    if (!dfs(S, v, 0)) {
      System.out.println(-1);
      return;
    }
    
    for (int k = 0; k < N; k++) {
      for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
          S[i][j] = Math.min(S[i][j], S[i][k]+S[k][j]);
        }
      }
    }
    int max = 0;
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        if (S[i][j] != INF) {
          max = Math.max(max, S[i][j]);
        }
      }
    }
    System.out.println(max+1);
  }
  
  private static boolean dfs(int[][] S, int[] v, int n) {

    for (int i = 0; i < v.length; i++) {
      if (S[n][i] != 1) {
        continue;
      }
      if ((v[n] == 1 && v[i] == 1) || (v[n] == 2 && v[i] == 2)) {
        return false;
      }
      if (v[i] == 0) {
        v[i] = v[n] == 1 ? 2 : 1;
        if (!dfs(S, v, i)) {
          return false;
        }
      }
    }
    return true;
  }
}