import java.util.*;

public class Main implements Runnable {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        // Run with 32MB stack
        Thread thread = new Thread(null, new Main(), "", 32 * 1024 * 1024);
        thread.start();
    }

    @Override
    public void run() {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static double[][] A;
    static int N;

    static double bestXY(double x, double y) {
        double res = 0;
        for (int i = 0; i < N; i++) {
            double dx = A[i][0] - x;
            double dy = A[i][1] - y;
            double diff = dx * dx + dy * dy;
            res = Math.max(res, diff);
        }

        return res;
    }

    static double bestY(double x) {
        double l = 0, r = 1000;
        for (int i = 0; i < 100; i++) {
            double c1 = (2 * l + r) / 3;
            double c2 = (l + 2 * r) / 3;
            if (bestXY(x, c1) < bestXY(x, c2)) {
                r = c2;
            } else {
                l = c1;
            }
        }
        return bestXY(x, l);
    }

    static void solve(Scanner scanner) {
        N = Integer.parseInt(scanner.next());
        A = new double[N][2];
        for (int i = 0; i < N; i++) {
            A[i][0] = Integer.parseInt(scanner.next());
            A[i][1] = Integer.parseInt(scanner.next());
        }

        double l = 0, r = 1000;
        for (int i = 0; i < 100; i++) {
            double c1 = (2 * l + r) / 3;
            double c2 = (l + 2 * r) / 3;
            if (bestY(c1) < bestY(c2)) {
                r = c2;
            } else {
                l = c1;
            }
        }

        System.out.printf("%.10f\n", Math.sqrt(bestY(l)));
    }
}
