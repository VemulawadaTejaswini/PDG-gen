import java.util.*;
public class Main {
    static int lowerBound(int a[], int v) {
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
        int A[] = new int[N], B[] = new int[N];
        for (int n = 0; n < N; n++) {
            A[n] = sc.nextInt();
        }
        for (int n = 0; n < N; n++) {
            B[n] = sc.nextInt();
        }
        int ans = 0;
        for (int k = 0; k < 30; k++) {
            int[] a = Arrays.copyOf(A, N);
            int[] b = Arrays.copyOf(B, N);
            for (int i = 0; i < N; i++) {
                a[i] &= (1 << (k + 1)) - 1;
                b[i] &= (1 << (k + 1)) - 1;
            }
            int count = 0;
            Arrays.sort(b);
            for (int i = 0; i < N; i++) {
                int k1 = lowerBound(b, (1 << k) - a[i]);
                int k2 = lowerBound(b, (1 << (k + 1)) - a[i]);
                count += k2 - k1;
                if (k >= 1) {
                    int k3 = lowerBound(b, (3 << k) - a[i]);
                    count += N - k3;
                }
                count %= 2;
            }
            if (count % 2 == 1) {
                ans |= 1 << k;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
