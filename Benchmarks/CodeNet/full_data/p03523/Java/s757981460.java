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
        String targert = "AKIHABARA".replaceAll("A", "");
        String s = in.next();
        if (s.contains("AA") && !s.contains("KIH")) {
            out.println("NO");
            return;
        }

        if (targert.equals(s.replaceAll("A", ""))) {
            out.println("YES");
        } else {
            out.println("NO");
        }
    }
}

class Tee implements Comparable<Tee> {
    long cost;
    long size;
    double value;

    Tee(long cost, long size) {
        this.cost = cost;
        this.size = size;
        this.value = 100 * cost / size;
    }

    @Override
    public int compareTo(Tee o) {
        if (this.value == o.value) {
            if (this.size > o.size) {
                return 1;
            } else {
                return -1;
            }
        } else if (this.value > o.value) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return String.valueOf(this.value);
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
