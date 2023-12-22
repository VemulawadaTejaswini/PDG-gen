import java.util.*;

public class Main {
    static long mod = 1000000007;

    public static long gcd(long a, long b) {
        if (a == 0) {
            return b;
        } else if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        int[] r = new int[n+1];

        for (int i = 1; i <= n; ++i) {
            a[i] = sc.nextInt();
        }

        for (int i = n; i >= 1; --i) {
            if (i * 2 <= n) {
                int total = 0;
                for (int j = i * 2; j <= n; j += i) {
                    total += r[j];
                }
                if (total % 2 == a[i]) {
                    r[i] = 0;
                } else {
                    r[i] = 1;
                }
            } else {
                r[i] = a[i];
            }
        }

        int cnt = 0;
        for (int i = 1; i <= n; ++i) {
            // System.err.println(String.format(">> %d %d", i, r[i]));
            if (r[i] > 0) {
                cnt++;
            }
        }

        System.out.println(cnt);
        if (cnt > 0) {
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= n; ++i) {
                if (r[i] > 0) {
                    sb.append(r[i]);
                    cnt--;
                    if (cnt > 0) {
                        sb.append(" ");
                    }
                }
            }
            System.out.println(sb.toString());
        }
    }
}
