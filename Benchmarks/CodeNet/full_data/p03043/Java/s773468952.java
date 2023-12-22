import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (InputReader in = new InputReader(); PrintWriter out = new PrintWriter(System.out)) {
            new Main().solve(in, out);
        }
    }

    private void solve(InputReader in, PrintWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();

        double ans = 0.0;
        for (int i = 1; i <= n; i++) {
            int tmp = i;
            int p = 0;
            while (tmp < k) {
                tmp *= 2;
                p++;
            }

            ans += Math.pow(0.5, p);
        }
        out.println(ans / n);
    }
}

class InputReader implements AutoCloseable {
    private final Scanner sc = new Scanner(System.in);

    String next() {
        return this.sc.next();
    }

    int nextInt() {
        return Integer.parseInt(this.sc.next());
    }

    long nextLong() {
        return Long.parseLong(this.sc.next());
    }

    double nextDouble() {
        return Double.parseDouble(this.sc.next());

    }

    @Override
    public void close() {
        this.sc.close();
    }
}
