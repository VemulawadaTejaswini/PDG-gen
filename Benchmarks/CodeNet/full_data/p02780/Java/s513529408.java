import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int n = sc.nextInt();
        final int k = sc.nextInt();

        final int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }

        double ans = Double.MIN_VALUE;

        final double[] evs = new double[1001];
        for (int i = 1; i <= 1000; i++) {
            evs[i] = getExpectedValue(i);
        }

        for (int i = 0; i <= n-k; i++) {
            double ev = 0;
            for (int j = 0; j < k; j++) {
                ev += evs[p[i+j]];
            }
            ans = Math.max(ans, ev);
        }

        System.out.printf("%6f\n", ans);
    }

    private static double getExpectedValue(final int max) {
        double result = 0;
        for (double j = 1; j <= max; j++) {
            result += j;
        }
        return result / max;
    }
}
