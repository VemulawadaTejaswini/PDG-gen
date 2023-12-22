import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {

            int N = in.nextInt();
            int K = in.nextInt();

            int[] x = new int[N];
            int[] y = new int[N];
            for (int i = 0; i < N; i++) {
                x[i] = in.nextInt();
                y[i] = in.nextInt();
            }

            long area = Long.MAX_VALUE;
            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    int count = 0;
                    for (int k = 0; k < N; k++) {
                        if (isInside(x[i], y[i], x[j], y[j], x[k], y[k])) {
                            count++;
                        }
                    }
                    if (count >= K) {
                        area = Math.min(area, Math.abs(x[i] - x[j]) * Math.abs(y[i] - y[j]));
                    }
                }
            }

            System.out.println(area);
        }
    }

    private static boolean isInside(int xi, int yi, int xj, int yj, int xk, int yk) {
        if (xk < Math.min(xi, xj) || xk > Math.max(xi, xj)) {
            return false;
        }
        if (yk < Math.min(yi, yj) || yk > Math.max(yi, yj)) {
            return false;
        }
        return true;
    }
}
