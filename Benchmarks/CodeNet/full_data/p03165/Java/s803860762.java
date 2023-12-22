import java.awt.*;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    static String s, t;
    static int dp[][];
    static StringBuilder sb = new StringBuilder();

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        t = sc.next();
        int n = s.length(), m = t.length();
        dp = new int[n+1][m+1];
        for (int a[] : dp) Arrays.fill(a, -1);
        check(n - 1, m - 1);
        System.out.println(lcs(n , m ));
    }

    static int check(int n, int m) {
        if (n < 0 || m < 0) return 0;
        if (dp[n+1][m+1] != -1) return dp[n+1][m+1];
        if (s.charAt(n) == t.charAt(m)) return dp[n+1][m+1] = check(n - 1, m - 1) + 1;
        return dp[n+1][m+1] = Math.max(check(n - 1, m), check(n, m - 1));
    }

    static String lcs(int n, int m) {
        if (n==0 || m==0)return "";
        if (s.charAt(n-1) == t.charAt(m-1)) return lcs(n - 1, m - 1) + s.charAt(n-1);
        if (dp[n][m - 1] > dp[n - 1][m]) return lcs(n, m - 1);
        return lcs(n - 1, m);


    }
}