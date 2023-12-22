import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() + 2;
        long c = sc.nextLong();

        long[] dists = new long[n];
        long[] values = new long[n];

        long[] clockwise = new long[n];
        long[] counterClockwise = new long[n];

        for (int i = 1; i < n - 1; i++) {
            dists[i] = sc.nextLong();
            values[i] = sc.nextLong();
        }
        dists[n - 1] = c;

        for (int i = 1; i < n; i++) {
            clockwise[i] = clockwise[i - 1] + values[i];
            counterClockwise[i] = counterClockwise[i - 1] + values[(n - 1) - i];
        }

        long[] clockwiseValues = new long[n];
        long[] clockwiseValuesToZero = new long[n];
        long[] counterClockwiseValues = new long[n];
        long[] counterClockwiseValuesToZero = new long[n];
        for (int i = 1; i < n; i++) {
            clockwiseValues[i] = Math.max(clockwiseValues[i - 1], clockwise[i] - dists[i]);
            clockwiseValuesToZero[i] = Math.max(clockwiseValuesToZero[i - 1], clockwise[i] - (dists[i] * 2));

            counterClockwiseValues[i] = Math.max(counterClockwiseValues[i - 1], counterClockwise[i] - (c - dists[(n - 1) - i]));
            counterClockwiseValuesToZero[i] = Math.max(counterClockwiseValuesToZero[i - 1], counterClockwise[i] - (c - dists[(n-1)-i]) * 2);
        }

        long ans = 0;
        for (int i = 0; i < n - 1; i++) {
            long tmp = Math.max(
                clockwiseValues[i] + counterClockwiseValuesToZero[(n - 1) - i - 1],
                clockwiseValuesToZero[i] + counterClockwiseValues[(n - 1) - i - 1]
            );
            ans = Math.max(tmp, ans);
        }
        System.out.print(ans);
    }
}
