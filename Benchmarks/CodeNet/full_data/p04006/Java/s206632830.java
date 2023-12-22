import java.util.*;

public class Main {

    public static void main(String[] args) {
        final long INF = (long) 1e15;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long x = sc.nextLong();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        long[] b = new long[n];
        for (int i = 0; i < n; i++) {
            b[i] = INF;
        }

        long ans = INF;
        for (int k = 0; k < n; k++) {
            long tmp = x * k;
            for (int i = 0; i < n; i++) {
                b[i] = Math.min(b[i], a[(i - k + n) % n]);
                tmp += b[i];
            }
            ans = Math.min(ans, tmp);
        }

        System.out.println(ans);
    }
}
