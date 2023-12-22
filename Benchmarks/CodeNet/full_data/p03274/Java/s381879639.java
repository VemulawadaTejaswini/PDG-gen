import java.util.*;

public class Main {
    public void main(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l[] = new int[n + 1];
        int r[] = new int[n + 1];
        int ln = 0, rn = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x < 0) {
                l[ln++] = -x;
            } else if (x == 0) {
                k--;
            } else {
                r[++rn] = x;
            }
        }
        sc.close();

        l = Arrays.copyOf(l, ln + 1);
        r = Arrays.copyOf(r, rn + 1);

        int ans = 4 * 100_000_000;
        for (int i = 0; i <= k; i++) {
            if (i <= ln && (k - i) <= rn) {
                ans = Math.min(ans, r[k - i] * 2 + l[ln - i]);
                ans = Math.min(ans, r[k - i] + l[ln - i] * 2);
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
    }
}
