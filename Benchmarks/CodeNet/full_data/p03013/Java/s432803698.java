import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    //Typical Stairs
    //DP?
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        int mod = 1000000007;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < m; i++) list.add(sc.nextInt());
        for (int i = 1; i <= n; i++) {
            if (list.contains(i)) {
                continue;
            } else {
                if (i == 1) {
                    dp[i] = 1;
                } else dp[i] = (dp[i - 1] % mod + dp[i - 2] % mod) % mod;
            }
        }
        System.out.println(dp[n]);
        sc.close();
    }
}
