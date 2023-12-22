import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int w = scan.nextInt();
        char[][] chars = new char[h][w];
        long[][] dp = new long[h][w];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i],-1);
        }
        for (int i = 0; i < h; i++) {
            String p = scan.next();
            for (int j = 0; j < p.length(); j++) {
                chars[i][j] = p.charAt(j);
            }
        }
        System.out.println(dfs(chars,0,0,h,w,dp));
    }

    private static long dfs(char[][] chars, int i, int j, int h, int w,long[][] dp) {
        if(i == h-1 && j == w-1) return chars[i][j] == '#'?1:0;
        if(i >= h || j >= w) return h+w;
        if(dp[i][j] != -1) return dp[i][j];
        dp[i][j] = (chars[i][j] == '#' ? 1 : 0) + Math.min(dfs(chars, i + 1, j, h, w, dp), dfs(chars, i, j + 1, h, w, dp));
        return dp[i][j];
    }
}
