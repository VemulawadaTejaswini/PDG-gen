import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int M = in.nextInt();
            long[] x = new long[N];
            long[] y = new long[N];
            long[] z = new long[N];
            for (int i = 0; i < N; i++) {
                x[i] = in.nextLong();
                y[i] = in.nextLong();
                z[i] = in.nextLong();
            }

            int[] a = { -1, 1 };

            long max = (long) -1e18;
            for (int i : a) {
                for (int j : a) {
                    for (int k : a) {

                        long[] diff = new long[N];
                        for (int n = 0; n < N; n++) {
                            diff[n] = i * x[n] + j * y[n] + k * z[n];
                        }
                        Arrays.sort(diff);

                        long sum = 0;
                        for (int l = 0; l < M; l++) {
                            sum += diff[N - 1 - l];
                        }

                        max = Math.max(max, sum);
                    }
                }
            }

            System.out.println(max);
        }
    }
}
