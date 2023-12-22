import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int[] a = new int[n + 1];
        long ans = 0;
        for (int i = 1; i <= n; i++) {
            a[i] = scanner.nextInt();
            if (a[i - 1] <= a[i]) {
                ans += a[i - 1];
                a[i] -= a[i - 1];
            } else if (a[i] == 0) {
                ans += a[i - 1] / 2;
            } else {
                ans += (a[i - 1] + 1) / 2;
                a[i] -= a[i - 1] % 2;
            }
        }
        System.out.println(ans);
    }
}