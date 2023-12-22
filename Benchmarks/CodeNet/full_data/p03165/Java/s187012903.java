import java.util.*;
import java.io.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();
    int n = s.length();
    int m = t.length();
    int[][] dp = new int[n+1][m+1];
    for(int i = 1; i<=n; i++) {
        for(int j = 1; j<=m; j++) {
            if(s.charAt(i-1)==t.charAt(j-1))
                dp[i][j] = dp[i-1][j-1]+1;
            else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
        }
    }
    StringBuilder sb = new StringBuilder();
    int row = n;
    int col = m;
    while(row>0 && col>0) {
        int curr = dp[row][col];
        if(curr==dp[row-1][col-1]+1) {
            sb.append(s.charAt(row-1));
            row--;
            col--;
        }
        else {
            if(curr==dp[row-1][col]) {
                row--;
            }
            else {
                col--;
            }
        }
    }
    System.out.println(sb.reverse().toString());
  }
}