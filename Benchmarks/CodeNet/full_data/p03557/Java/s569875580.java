import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long[] a = new long[n];
        long[] b = new long[n];
        long[] c = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = Long.parseLong(sc.next());
        }
        for (int i = 0; i < n; i++) {
            b[i] = Long.parseLong(sc.next());
        }
        for (int i = 0; i < n; i++) {
            c[i] = Long.parseLong(sc.next());
        }
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        long ans = 0;
        for (int i = 0; i < n; i++) {
            long temp = b[i];
            int idx = lowerBound(n, a, temp);
            int idx2 = lowerBound(n, c, temp + 1);
            ans += idx * (n - idx2);
        }
        System.out.println(ans);
    }

    private static int lowerBound(int n, long[] x, long y) {
        int left = 0;
        int right = n;
        while (left < right) {
            int mid = (left + right) / 2;
            if (x[mid] < y) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}