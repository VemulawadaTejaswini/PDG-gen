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

    static void solve(Scanner scanner) {
        int N = Integer.parseInt(scanner.next());
        int[][] A = new int[N][2];
        for (int i = 0; i < N; i++) {
            A[i][0] = Integer.parseInt(scanner.next());
            A[i][1] = Integer.parseInt(scanner.next());
        }

        double x = 0, y = 0;
        for (int i = 0; i < N; i++) {
            x += A[i][0];
            y += A[i][1];
        }
        x /= N;
        y /= N;

        double temp = 0.1;
        double max = 0;
        for (int i = 0; i < 3_000_000; i++) {
            double xto = 0, yto = 0;
            max = 0;
            for (int j = 0; j < N; j++) {
                double x2 = A[j][0], y2 = A[j][1];
                double diff = Math.sqrt((x2 - x) * (x2 - x) + (y2 - y) * (y2 - y));
                if (diff > max) {
                    max = diff;
                    xto = x2;
                    yto = y2;
                }
            }

            double ydiff = yto - y;
            double xdiff = xto - x;
            double dy = temp * (ydiff * ydiff / (xdiff * xdiff + ydiff * ydiff));
            double dx = temp * (xdiff * xdiff / (xdiff * xdiff + ydiff * ydiff));
            if (xdiff > 0) {
                x += dx;
            } else {
                x -= dx;
            }
            if (ydiff > 0) {
                y += dy;
            } else {
                y -= dy;
            }
            temp *= 0.99999;
        }

        System.out.println(max);
    }
}
