import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
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
        int numOfOdd = 0;
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int tmp = (a % 2 == 0) ? 2 : 1;
            numOfOdd = (numOfOdd == 0) ? tmp : tmp * numOfOdd;
        }

        out.println(((int) Math.pow(3, n)) - numOfOdd);
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
