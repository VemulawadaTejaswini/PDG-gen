import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int c = sc.nextInt();
    long[][] d = new long[c][c];
    for(int i = 0; i < c; i++) {
      for(int j = 0; j < c; j++) {
        d[i][j] = sc.nextLong();
      }
    }
    long[][] e = new long[3][c];
    for(int i = 0; i < n; i++) {
      for(int j = 0; j < n; j++) {
        int C = sc.nextInt() - 1;
        e[(i + j) % 3][C]++;
      }
    }
    long ans = Long.MAX_VALUE;
    for(int i = 0; i < c; i++) {
      for(int j = 0; j < c; j++) {
        for(int k = 0; k < c; k++) {
          if((i != j) && (i != k) && (j != k)) {
            long t = 0;
            for(int s = 0; s < c; s++) {
              t += (e[0][s] * d[s][i]);
              t += (e[1][s] * d[s][j]);
              t += (e[2][s] * d[s][k]);
            }
            ans = Math.min(ans, t);
          }
        }
      }
    }
    System.out.println(ans);
  }
}