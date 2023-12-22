
import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    final static int MOD  =1000000007;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        String[] str = scanner.nextLine().split(" ");
        int n = Integer.valueOf(str[0]);
        int m = Integer.valueOf(str[1]);
        char[][] grid = new char[n][m];
        for (int i = 0; i < n; i++) {
            grid[i] = scanner.nextLine().toCharArray();
        }
        int[][] dp = new int[n+1][m+1];
        for(int i=n-1 ;i>=0 ; i--){
            for (int j=m-1;j>=0;j--) {
                if(i==n-1 && j==m-1)
                    dp[i][j] = 1;
                else if (grid[i][j] == '#')
                    dp[i][j] = 0;
                else
                    dp[i][j] = ((dp[i+1][j]%MOD) + (dp[i][j+1]%MOD))%MOD;
            }
        }
        for (int[] i : dp) {
            for (int o : i)
                System.out.print(o + " ");
            System.out.println();
        }

        System.out.println(dp[0][0]);
    }
}