import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] left = new int[n];
        int[] right = new int[n];

        for (int i = 1; i < n; i++) {
            left[i] = gcd(left[i - 1], nums[i - 1]);
        }
        for (int i = n - 2; i >= 0; i--) {
            right[i] = gcd(right[i + 1], nums[i + 1]);
        }

        int ans = 1;
        for (int i = 0; i < n; i ++) {
            ans = Math.max(ans, gcd(left[i], right[i]));
        }

        System.out.println(ans);
    }

    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a%b);
    }
}