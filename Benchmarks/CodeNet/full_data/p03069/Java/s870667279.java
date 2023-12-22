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
        char[] s = in.next().toCharArray();
        int t = 0;
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            char c = s[i];
            if (c == '.' && flag) {
                t++;
            }

            if (c == '#') {
                flag = true;
            }
        }

        flag = false;
        int t2 = 0;
        for (int i = n - 1; i >= 0; i--) {
            char c = s[i];
            if (c == '#' && flag) {
                t2++;
            }

            if (c == '.') {
                flag = true;
            }
        }

        out.println(Math.min(t, t2));
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
