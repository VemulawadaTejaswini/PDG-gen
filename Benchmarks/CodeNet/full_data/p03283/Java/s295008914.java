import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (InputReader in = new InputReader(); PrintWriter out = new PrintWriter(System.out)) {
            new Main().solve(in, out);
            out.flush();
        }
    }

    void solve(InputReader in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        int Q = in.nextInt();

        int[][] map = new int[n][n + 1];
        for (int i = 0; i < m; i++) {
            int l = in.nextInt() - 1;
            int r = in.nextInt();
            map[l][r]++;
        }

        for (int i = 0; i < n; i++) {
            int tmp = 0;
            for (int j = 0; j <= n; j++) {
                map[i][j] += tmp;
                tmp = map[i][j];
            }
        }

        for (int i = 0; i < Q; i++) {
            int p = in.nextInt() - 1;
            int q = in.nextInt();
            int ans = 0;
            for (int j = p; j < q; j++) {
                ans += map[j][q] - map[j][p];
            }
            out.println(ans);
        }
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
