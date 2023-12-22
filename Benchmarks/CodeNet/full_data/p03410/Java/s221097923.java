import java.util.*;
public class Main {
    static int lowerBound(long a[], long v) {
        int l = 0, r = a.length - 1;
        while (r - l >= 0) {
            int c = (l + r) / 2;
            if (v <= a[c]) {
                r = c - 1;
            } else {
                l = c + 1;
            }
        }
        return l;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long A[] = new long[N], B[] = new long[N];
        for (int n = 0; n < N; n++) { A[n] = sc.nextLong(); }
        for (int n = 0; n < N; n++) { B[n] = sc.nextLong(); }
        long a[] = new long[N], b[] = new long[N];
        long ans = 0;
        for (int k = 0; k < 30; k++) {
            int count = 0;
            long mask = (1 << (k + 1)) - 1;
            for (int i = 0; i < N; i++) {
                a[i] = A[i] & mask;
                b[i] = B[i] & mask;
            }
            Arrays.sort(b);
            long T = 1 << k;
            for (int i = 0; i < N; i++) {
                long f1 = lowerBound(b, 1 * T - a[i]);
                long t1 = lowerBound(b, 2 * T - a[i]);
                long f2 = lowerBound(b, 3 * T - a[i]);
                long t2 = lowerBound(b, 4 * T - a[i]);
                count += t1 - f1;
                count %= 2;
                count += t2 - f2;
                count %= 2;
            }
            if (count == 1) {
                ans |= 1 << k;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
