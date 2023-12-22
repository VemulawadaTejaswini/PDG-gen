import java.util.*;

public class Main {
    static int n;
    static Integer[] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        dp = new Integer[n];

        for (int i = 0; i < n; i++) {
            dp[i] = sc.nextInt();
        }
        Arrays.sort(dp, Collections.reverseOrder());
        int h = 0;
        int w = 0;
        int tmp = dp[0];
        for (int i = 1; i < n; i++) {
            if (tmp == dp[i]) {
                if (h == 0) {
                    h = tmp;
                } else {
                    w = tmp;
                    break;
                }
                tmp = -1;
            } else {
                tmp = dp[i];
            }
        }
        System.out.println(h*w);
    }
}
