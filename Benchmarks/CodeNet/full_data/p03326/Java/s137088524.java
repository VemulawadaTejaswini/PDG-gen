import java.util.Arrays;
import java.util.Scanner;

class Main {
    static int m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        m = sc.nextInt();
        long x[] = new long[n];
        long y[] = new long[n];
        long z[] = new long[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextLong();
            y[i] = sc.nextLong();
            z[i] = sc.nextLong();
        }
        long sum[] = new long[n];
        // ppp
        for (int i = 0; i < n; i++) {
            sum[i] = x[i] + y[i] + z[i];
        }
        long ans = maxSum(sum);
        // mpp
        for (int i = 0; i < n; i++) {
            x[i] *= -1;
            sum[i] = x[i] + y[i] + z[i];
        }
        ans = Math.max(ans, maxSum(sum));
        // mmp
        for (int i = 0; i < n; i++) {
            y[i] *= -1;
            sum[i] = x[i] + y[i] + z[i];
        }
        ans = Math.max(ans, maxSum(sum));
        // mmm
        for (int i = 0; i < n; i++) {
            z[i] *= -1;
            sum[i] = x[i] + y[i] + z[i];
        }
        ans = Math.max(ans, maxSum(sum));
        // pmm
        for (int i = 0; i < n; i++) {
            x[i] *= -1;
            sum[i] = x[i] + y[i] + z[i];
        }
        ans = Math.max(ans, maxSum(sum));
        // ppm
        for (int i = 0; i < n; i++) {
            y[i] *= -1;
            sum[i] = x[i] + y[i] + z[i];
        }

        ans = Math.max(ans, maxSum(sum));
        // mpm
        for (int i = 0; i < n; i++) {
            x[i] *= -1;
            sum[i] = x[i] + y[i] + z[i];
        }
        ans = Math.max(ans, maxSum(sum));
        // pmp
        for (int i = 0; i < n; i++) {
            x[i] *= -1;
            y[i] *= -1;
            z[i] *= -1;
            sum[i] = x[i] + y[i] + z[i];
        }
        ans = Math.max(ans, maxSum(sum));
        System.out.println(ans);
        sc.close();
    }

    public static long maxSum(long[] sum) {
        Arrays.sort(sum);
        int len = sum.length;
        long ret = 0;
        for (int i = 0; i < m; i++) {
            ret += sum[len - 1 - i];
        }
        return ret;
    }
}
