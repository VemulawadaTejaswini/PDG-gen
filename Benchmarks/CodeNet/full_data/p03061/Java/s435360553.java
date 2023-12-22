import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = scan.nextInt();
        }
        Arrays.sort(a);
        int gcd = gcd_multi(N, a, -1);
        int[] x = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = a[i] / gcd;
        }
        int min_gcd_first = Integer.MAX_VALUE;
        int index_first = 0;
        for (int i = 1; i < N; i++) {
            int t = gcd(x[0], x[i]);
            if (t < min_gcd_first) {
                index_first = i;
                min_gcd_first = t;
            }
        }
        int min_gcd_last = Integer.MAX_VALUE;
        int index_last = 0;
        for (int i = 0; i < N-1; i++) {
            int t = gcd(x[N-1], x[i]);
            if (t < min_gcd_last) {
                index_last = i;
                min_gcd_last = t;
            }
        }
        gcd = Math.max(gcd, gcd_multi(N, a, 0));
        gcd = Math.max(gcd, gcd_multi(N, a, N-1));
        gcd = Math.max(gcd, gcd_multi(N, a, index_first));
        gcd = Math.max(gcd, gcd_multi(N, a, index_last));
        System.out.println(gcd);
    }
    public static int gcd_multi(int N, int[] a, int skip) {
        int gcd = 0;
        for (int i = 0; i < N; i++) {
            if (i == skip) {
                continue;
            }
            gcd = gcd(a[i], gcd);
        }
        return gcd;
    }

    public static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        }
        int ans = gcd(y, x % y);
        return ans;
    }
}
