import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static String s;
    public static String t;
    static int dp[][] = new int[3005][3005];

    public static int solve(int i, int j) {
        if (i == s.length() || j == t.length())
            return dp[i][j] = 0;
        if (dp[i][j] != -1)
            return dp[i][j];
        if (s.charAt(i) == t.charAt(j))
            return dp[i][j] = 1 + solve(i + 1, j + 1);
        return dp[i][j] = Math.max(solve(i + 1, j), solve(i, j + 1));
    }

    public static String print(int i, int j) {
        if (i == s.length() || j == t.length())
            return "";
        int ans = solve(i, j);
        if (ans == 0) {
            return "";
        }
        if (ans == 1 + dp[i + 1][j + 1]) {
            return s.charAt(i) + print(i + 1, j + 1);
        } else if (ans == dp[i + 1][j])
            return print(i + 1, j);
        else
            return print(i, j + 1);

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        t = sc.next();
        for (int x[] : dp)
            Arrays.fill(x, -1);
        System.out.println(print(0, 0));
    }
}