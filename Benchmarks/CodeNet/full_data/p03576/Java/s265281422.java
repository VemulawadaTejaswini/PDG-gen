import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {

            int N = in.nextInt();
            int K = in.nextInt();

            long[] x = new long[N];
            long[] y = new long[N];
            for (int i = 0; i < N; i++) {
                x[i] = in.nextInt();
                y[i] = in.nextInt();
            }

            long[] x2 = Arrays.copyOf(x, N);
            Arrays.sort(x2);
            long[] y2 = Arrays.copyOf(y, N);
            Arrays.sort(y2);

            long area = Long.MAX_VALUE;
            for (int i = K-1; i < N; i++) {
                for (int j = K-1; j < N; j++) {

                    int count = 0;
                    for (int k = 0; k < N; k++) {
                        if (isInside(x2[i], y2[j], x2[i - (K-1)], y2[j - (K-1)], x[k], y[k])) {
                            count++;
                        }
                    }
                    if (count >= K) {
                        area = Math.min(area, Math.abs(x2[i] - x2[i - (K-1)]) * Math.abs(y2[j] - y2[j - (K-1)]));
                    }
                }

            }

            System.out.println(area);
        }
    }

    private static boolean isInside(long xi, long yi, long xj, long yj, long xk, long yk) {
        if (xk < Math.min(xi, xj) || xk > Math.max(xi, xj)) {
            return false;
        }
        if (yk < Math.min(yi, yj) || yk > Math.max(yi, yj)) {
            return false;
        }
        return true;
    }
}
