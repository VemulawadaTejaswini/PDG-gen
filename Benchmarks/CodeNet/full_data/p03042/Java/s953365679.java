import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (InputReader in = new InputReader(); PrintWriter out = new PrintWriter(System.out)) {
            new Main().solve(in, out);
        }
    }

    private void solve(InputReader in, PrintWriter out) {
        // MM 01 ~ 12
        String s = in.next();
        int pre = Integer.parseInt(s.substring(0, 2));
        int suf = Integer.parseInt(s.substring(2, 4));
        if ((pre == 0 || 12 < pre) && (1 <= suf && suf <= 12)) {
            out.println("YYMM");
        } else if ((suf == 0 || 12 < suf) && (1 <= pre && pre <= 12)) {
            out.println("MMYY");
        } else if ((suf < 1 || 12 < suf) && (pre < 1 || 12 < pre)) {
            out.println("NA");
        } else {
            out.println("AMBIGUOUS");
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
