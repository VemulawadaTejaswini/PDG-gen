import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 2);
        map.put(2, 5);
        map.put(3, 5);
        map.put(4, 4);
        map.put(5, 5);
        map.put(6, 6);
        map.put(7, 3);
        map.put(8, 7);
        map.put(9, 6);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] dp = new int[10002];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        Integer[] a = new Integer[m];
        int[] b = new int[m];
        for (int i = 0 ; i < m ;i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for (int i = 0 ; i < m ; i++) {
            b[i] = map.get(a[m - 1 - i]);
        }
        for (int i = 1 ; i <= n ; i++) {
            for (int j = 0 ; j < m ; j++) {
                if (i >= b[j] && dp[i - b[j]] != -1) {
                    //最大の桁数の数字がb[j]だとすると、dp[i-b[j]]に一桁ついかしたものになるので
                    dp[i] = Math.max(dp[i - b[j]] + 1, dp[i]);
                }
            }
        }

        String ans = "";
        int remain = dp[n];
        int match = n;
        while (remain > 0) {
            for (int i = 0 ; i < m ; i++) {
                if (match >= b[i] && dp[match - b[i]] == remain - 1) {
                    ans += a[m - i - 1];
                    remain--;
                    match -= b[i];
                    break;
                }
            }
        }
        System.out.println(ans);

    }

}