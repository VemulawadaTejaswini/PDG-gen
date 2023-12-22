import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int N = s.length();
        int M = t.length();
        Pair[][] dp = new Pair[N+1][M+1];
        for (int i = 0; i < N+1; i++) {
            dp[i][0] = new Pair(0,"");
        }
        for (int i = 0; i < M+1; i++) {
            dp[0][i] = new Pair(0,"");
        }
        for (int i = 1; i < N+1; i++) {
            for (int j = 1; j < M+1; j++) {
                Pair tmp = Pair.chooseLarger(dp[i-1][j], dp[i][j-1]);
                Pair x;
                if(s.charAt(i-1) == t.charAt(j-1)) {
                    x = new Pair(dp[i-1][j-1].length + 1, dp[i-1][j-1].value + s.charAt(i-1));
                } else {
                    x = dp[i-1][j-1];
                }
                dp[i][j] = Pair.chooseLarger(tmp, x);
            }
        }
        System.out.println(dp[N][M].value);
    }
    public static class Pair {
        public static Pair chooseLarger(Pair a, Pair b) {
            // System.out.println(a);
            if(a.length >= b.length) {
                return new Pair(a.length,a.value);
            } else {
                return new Pair(b.length,b.value);
            }
        }
        public int length;
        public String value;
        public Pair(int length, String value) {
            this.length = length;
            this.value = value;
        }
    }
}