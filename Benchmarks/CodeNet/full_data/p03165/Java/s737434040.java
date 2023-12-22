import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
   	public String lcs(String a, String b) {
        int n = a.length();
        int m = b.length();
        int[][] memo = new int[n + 1][m + 1];
        for (int[] row: memo) {
            Arrays.fill(row, -1);
        }
        lcs(a, n, b, m, memo);
        StringBuilder sb = new StringBuilder();
        reconstructSolution(a, b, memo, sb, n, m);
        return sb.reverse().toString();
    }
    private void reconstructSolution(String a, String b, int[][] memo, StringBuilder sb, int i, int j) {
        if (i <= 0 || j <= 0) {
            return;
        }
        if (a.charAt(i - 1) == b.charAt(j - 1)){
            sb.append(a.charAt(i - 1));
            reconstructSolution(a, b, memo, sb, i - 1, j - 1);
        } else if (memo[i - 1][j] > memo[i][j - 1]) {
           reconstructSolution(a, b, memo, sb, i - 1, j); 
        } else {
           reconstructSolution(a, b, memo, sb, i, j - 1); 
        }
    }
    private int lcs(String a, int i, String b, int j, int[][] memo) {
       if (i <= 0 || j <= 0) {
           return 0;
       }
       if (memo[i][j] != -1) {
           return memo[i][j];
       }
       if (a.charAt(i - 1) == b.charAt(j - 1)) {
           return memo[i][j] = 1 + lcs(a, i - 1, b, j - 1, memo);
       } else {
           int x = lcs(a, i - 1, b, j, memo);
           int y = lcs(a, i, b, j - 1, memo);
           return memo[i][j] = Math.max(x, y);
       }
    }
    public static void main(String[] args)  {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String a = br.readLine();
            String b = br.readLine();
          	Main app = new Main();
            String result = app.lcs(a, b);
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
