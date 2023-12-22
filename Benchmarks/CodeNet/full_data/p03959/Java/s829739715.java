import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int[] h = new int[n];
        int[] t = new int[n];
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            t[i] = scanner.nextInt();
            if (i == 0 || t[i - 1] != t[i]) {
                h[i] = t[i];
            }
        }
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            if (i == n - 1) {
                if (h[i] != 0 && h[i] != a[i]) {
                    System.out.println(0);
                    return;
                }
                h[i] = a[i];
            }
            if (i != 0 && a[i - 1] != a[i]) {
                if (h[i - 1] != 0 && h[i - 1] != a[i - 1]) {
                    System.out.println(0);
                    return;
                }
                h[i - 1] = a[i - 1];
            }
        }

        for (int i = 0; i < n; i++) {
            if (h[i] > t[i] || h[i] > a[i]) {
                System.out.println(0);
                return;
            }
        }

        long ans = 1;
        for (int i = 0; i < n; i++) {
            if (h[i] == 0) {
                ans = ans * Math.min(t[i], a[i]) % 1000000007;
            }
        }
        System.out.println(ans);
    }
}