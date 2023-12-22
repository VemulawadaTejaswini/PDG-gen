import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        Integer a[] = new Integer[n];
        Integer dp[] = new Integer[n];
        Arrays.fill(dp, Integer.MAX_VALUE); 
        dp[0] = 0;

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
        }

        for (int i = 0; i < n-1; i++) {
            for (int j = 1; j < k+1; j++) {
                if (n <= i+j) {
                    continue;
                }
                dp[i+j] = Math.min(dp[i] + Math.abs(a[i] - a[i+j]), dp[i+j]);
            }
        }

        System.out.println(dp[n-1]);
        sc.close();
    }
}
