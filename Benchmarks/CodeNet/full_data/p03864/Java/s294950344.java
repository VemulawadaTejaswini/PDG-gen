import java.util.*;

public class Main {
    private static int[] update(int[] candies) {
        int[] sums = new int[candies.length-1];
        for (int i = 0; i < candies.length-1; i++) {
            sums[i] = candies[i] + candies[i+1];
        }

        return sums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] candies = new int[n];
        int[] sums;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            candies[i] = sc.nextInt();
        }
        sums = update(candies);

        int r;
        for (int i = 0; i < n - 2; i++) {
            if (sums[i] > x && sums[i+1] > x) {
                r = Math.max(sums[i]-x, sums[i+1]-x);
                candies[i+1] -= r;
                sums[i] -= r;
                sums[i+1] -= r;
                ans += r;
            }
            ans += Math.max((sums[i]-x), 0);
        }
        ans += Math.max((sums[n-2]-x), 0);

        System.out.println(ans);
    }
}
