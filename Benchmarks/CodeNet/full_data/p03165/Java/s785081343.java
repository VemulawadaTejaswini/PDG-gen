import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.rmi.server.ExportException;
import java.util.Arrays;
        import java.util.Scanner;

class Main {
    static Scanner sc;

    private static void nextArr(int[] h) {
        for(int i = 0; i < h.length; i++) h[i] = sc.nextInt();
    }

    private static int nextInt() {
        return sc.nextInt();
    }

    private static void print(Object... vals) {
        for(int i = 0; i < vals.length; i++) {
            if (i != vals.length - 1) {
                System.out.print(vals[i] + ",");
            } else {
                System.out.print(vals[i]);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        int n = s.length();
        int m = t.length();

        int[][] dp = new int[n + 1][m + 1];
        int[][][] prev = new int[n + 1][m + 1][2];
        // char[][] fill = new char[n + 1][m + 1];
        for(int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                dp[i][j] = Integer.MIN_VALUE;
                dp[i][0] = 0;
                dp[0][j] = 0;
                // fill[i][j] = 'F';
                prev[i][j][0] = -1;
                prev[i][j][1] = -1;
            }
        }

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                char left = s.charAt(i - 1);
                char right = t.charAt(j - 1);
                if (left == right && dp[i - 1][j - 1] != Integer.MIN_VALUE) {
                    // fill[i][j] = left;
                    int val = dp[i - 1][j - 1] + 1;
                    if (val >= dp[i][j]) {
                        dp[i][j] = val;
                        prev[i][j][0] = i - 1;
                        prev[i][j][1] = j - 1;
                    }
                }
                if (left != right) {
                    if (dp[i][j - 1] != Integer.MIN_VALUE) {
                        int val = dp[i][j - 1];
                        if (val >= dp[i][j]) {
                            dp[i][j] = val;
                            prev[i][j][0] = i;
                            prev[i][j][1] = j - 1;
                        }
                    }
                    if (dp[i - 1][j] != Integer.MIN_VALUE) {
                        int val = dp[i - 1][j];
                        if (val >= dp[i][j]) {
                            dp[i][j] = val;
                            prev[i][j][0] = i - 1;
                            prev[i][j][1] = j;
                        }
                    }
                }
            }
        }
        int x = n;
        int y = m;
        StringBuffer ans = new StringBuffer();
        int count = 0;
        while(x > 0 && y > 0) {
            // if (fill[x][y] != 'F') ans.append(fill[x][y]);
            // if (s.charAt(x - 1) == s.charAt(y - 1)) ans.append(s.charAt(x - 1));
            count += 1;
            int px = x;
            int py = y;
            x = prev[px][py][0];
            y = prev[px][py][1];
            if (x >= 0 && y >= 0 && x == px - 1 && y == py - 1) {
                ans.append(s.charAt(px - 1));
            }
        }
        print(ans.reverse().toString());
    }
}
