import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        long[] b = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        long[] sum = new long[n];
        long res = 0;
        long diff;
        for (int i = n - 1; i >= 0; i--) {
            a[i] = a[i] + sum[i];
            diff = (a[i] + b[i] - 1) / b[i] * b[i] - a[i];
            res += diff;
            if (i > 0) {
                sum[i - 1] = sum[i] + diff;
            }
        }
        System.out.println(res);
    }
}