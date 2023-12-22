import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (InputReader in = new InputReader(); PrintWriter out = new PrintWriter(System.out)) {
            new Main().solve(in, out);
            out.flush();
        }
    }

    private void solve(InputReader in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();

        int[][] map = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int l = 0; l < n; l++) {
                Arrays.fill(map[l], 0);
            }

            for (int j = 0; j < m; j++) {
                for (int i_i = 0; i_i <= i; i_i++) {
                    for (int j_i = 0; j_i <= j; j_i++) {
                        map[i_i][j_i] = (map[i_i][j_i] + 1) % 2;
                    }
                }
            }

            int ans = 0;
            for (int j = 0; j < n; j++) {
                for (int l = 0; l < m; l++) {
                    ans += map[j][l];
                }
            }

            if (ans == k) {
                out.println("Yes");
                return;
            }
        }

        out.println("No");
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
