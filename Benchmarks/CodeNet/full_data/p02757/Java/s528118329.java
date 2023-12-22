import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] first = br.readLine().split(" ", 2);
        int n = Integer.parseInt(first[0]);
        int p = Integer.parseInt(first[1]);
        char[] arr = br.readLine().toCharArray();
        int[][] dp = new int[n + 1][p];
        long count = 0;
        for (int i = 1; i <= n; i++) {
            int x = arr[i - 1] - '0';
            for (int j = 0; j < p; j++) {
                dp[i][(j * 10 + x) % p] += dp[i - 1][j];
            }
            dp[i][x % p]++;
            count += dp[i][0];
        }
        System.out.println(count);
    }
}
