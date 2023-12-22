import java.util.Scanner;

public class Main {
    public static void main(String args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        int premin = 200000;
        int premax = 0;
        int ans = 1;
        boolean f;
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            if (i < k) {
                if (premin > a[i]) {
                    premin = a[i];
                }
                if (premax < a[i]) {
                    premax = a[i];
                }
            }
        }

        for (int i = 0; i + k - 1 < n; i++) {
            f = true;
            if (premin != a[i] || premax > a[i + k]) {
                ans++;
            }
            if (premin > a[i + k]) {
                premin = a[i + k];
                f = false;
            }
            if (premax < a[i + k]) {
                premax = a[i + k];
                f = false;
            }
            if (f) {
                if (premin == a[i] || premax == a[i]) {
                    premin = 200000;
                    premax = 0;
                    for (int j = i + 1; j <= k; j++) {
                        if (premin > a[i]) {
                            premin = a[i];
                        }
                        if (premax < a[i]) {
                            premax = a[i];
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}