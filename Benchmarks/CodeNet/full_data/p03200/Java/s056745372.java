import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;
    long[] dp;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        char[] s = S.toCharArray();
        long c = 0;
        long ans = 0;
        for (int i = 0; i < S.length(); i++) {
            if (s[i] == 'W') {
                ans += c;
            } else {
                c++;
            }
        }
        System.out.println(ans);
    }
}