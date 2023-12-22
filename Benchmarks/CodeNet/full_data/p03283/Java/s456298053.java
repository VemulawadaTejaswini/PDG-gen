import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int q = sc.nextInt();
    int[][] mat = new int[n][n];
    for(int i = 0; i < m; i++) {
      int l = sc.nextInt();
      int r = sc.nextInt();
      for(int j = 0; j <= l; j++) {
        int s = Math.min(r - l, n - 1 - l);
        mat[j][s]++;
      }
    }
    int[][] mat2 = new int[n][n];
    for(int i = 0; i < n; i++) {
      for(int j = i; j < n; j++) { 
        for(int k = 0; k <= j - i; k++) {
          mat2[i][j] += mat[i][k];
        }
      }
    }
    for(int i = 0; i < q; i++) {
      int p = sc.nextInt();
      int a = sc.nextInt();
      System.out.println(mat2[p - 1][a - 1]);
    }
  }
}