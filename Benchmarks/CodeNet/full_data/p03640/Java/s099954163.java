import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        try (InputReader in = new InputReader(); PrintWriter out = new PrintWriter(System.out)) {
            new Main().solve(in, out);
            out.flush();
        }
    }

    void solve(InputReader in, PrintWriter out) {
        int h = in.nextInt();
        int w = in.nextInt();
        int n = in.nextInt();

        int[] row = new int[w];
        int index = 0;
        boolean goRight = true;
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            for (int j = 0; j < a; j++) {
                row[index] = a;
                index += (goRight) ? 1 : -1;

                if (index == w || index == -1) {
                    StringJoiner sj = new StringJoiner(" ");
                    for (int c : row) {
                        sj.add(String.valueOf(c));
                    }
                    out.println(sj);
                    row = new int[w];
                    goRight = !goRight;
                    index += (goRight) ? 1 : -1;
                }
            }
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
