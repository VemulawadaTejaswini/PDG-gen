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
        char[] s = in.next().toCharArray();
        int changeFB = 0;
        int changeFW = 0;
        for (int i = 0; i < s.length; i++) {
            if (i % 2 == 0) {
                if (s[i] == '0') {
                    changeFB++;
                } else {
                    changeFW++;
                }
            } else {
                if (s[i] == '0') {
                    changeFW++;
                } else {
                    changeFB++;
                }
            }
        }

        out.println(Math.min(changeFB, changeFW));
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