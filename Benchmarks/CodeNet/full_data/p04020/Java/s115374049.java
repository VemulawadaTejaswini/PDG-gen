import java.util.*;

public class Main {
    public void main(Scanner sc) {
        int n = sc.nextInt();
        long a[] = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        long ans = 0;
        for (int i = 0; i < n - 1; i++) {
            ans += a[i] / 2;
            a[i] %= 2;
            if (a[i] != 0 && a[i + 1] != 0) {
                long min = Math.min(a[i], a[i + 1]);
                ans += min;
                a[i] -= min;
                a[i + 1] -= min;
            }
        }

        ans += a[n - 1] / 2;

        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
