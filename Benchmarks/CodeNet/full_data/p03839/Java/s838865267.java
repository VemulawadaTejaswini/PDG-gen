import java.util.*;

public class Main {
    public void main(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        long a[] = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        long ans = 0;
        for (int i = 0; i < n - k; i++) {
            if (a[i] > 0) {
                ans += a[i];
            }
        }

        long tmp = 0;
        for (int i = n - k; i < n; i++) {
            tmp += a[i];
        }

        long maxWhite = 0;
        for (int i = Math.max(n - k, k); i < n; i++) {
            if (a[i] < 0) {
                long white = 0;
                for (int j = 0; j < k; j++) {
                    if (i - j >= n - k) {
                        white -= a[i - j];
                    } else {
                        white -= Math.max(a[i - j], 0);
                    }
                }
                maxWhite = Math.max(maxWhite, white);
            }
        }

        System.out.println(ans + Math.max(tmp + maxWhite, 0));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
