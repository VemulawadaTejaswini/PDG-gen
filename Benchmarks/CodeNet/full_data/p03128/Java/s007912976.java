import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int M = scan.nextInt();
        List<Integer> candidates = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            candidates.add(scan.nextInt());
        }
        int[] match = {2,5,5,4,5,6,3,7,6};
        String[] dp = new String[10007];
        for (int i = 0; i < 10000; i++) {
            dp[i] = "-";
        }
        dp[0] = "";
        for (int i = 0; i <= N; i++) {
            if ("-".equals(dp[i])) {
                continue;
            }
            for (int a : candidates) {
                dp[i + match[a-1]] = max(dp[i + match[a-1]], dp[i] + a);
            }
        }
        System.out.println(dp[N]);
    }
    private String max(String a, String b) {
        if ("-".equals(a)) {
            a = b;
        }
        if (a.length() < b.length()) {
            return b;
        }
        if (a.length() > b.length()) {
            return a;
        }
        if (a.compareTo(b) < 0) {
            return b;
        }
        return a;
    }
}
