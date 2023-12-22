import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
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
        int k = in.nextInt();
        String input = in.next();
        if (!input.contains("0")) {
            out.println(input.length());
            return;
        }
        char[] s = input.toCharArray();

        List<Distance> distances = new ArrayList<>();
        if (s[0] == '0' && s[1] == '1') {
            Distance b = new Distance();
            b.start = 0;
            b.end = 0;
            distances.add(b);
        } else if (s[0] == '1') {
            // Distance b = new Distance();
            // b.start = -1;
            // b.end = -1;
            // distances.add(b);
        }

        Distance b = new Distance();
        b.start = -1;
        b.end = -1;
        distances.add(b);

        int start = 0, end = 0;
        for (int i = 1; i < n - 1; i++) {
            if (s[i] == '0' && s[i - 1] == '1' && s[i + 1] == '1') {
                start = i;
                end = i;

                Distance d = new Distance();
                d.start = start;
                d.end = end;
                distances.add(d);
            } else if (s[i] == '0' && s[i - 1] == '1') {
                start = i;
            } else if (s[i] == '0' && s[i + 1] == '1') {
                end = i;

                Distance d = new Distance();
                d.start = start;
                d.end = end;
                distances.add(d);
            }
        }

        if (s[n - 1] == '0' && s[n - 2] == '1') {
            Distance d = new Distance();
            d.start = n - 1;
            d.end = n - 1;
            distances.add(d);
        } else if (s[n - 1] == '1') {
            // Distance d = new Distance();
            // d.start = n;
            // d.end = n;
            // distances.add(d);
        }

        Distance d = new Distance();
        d.start = n;
        d.end = n;
        distances.add(d);
        out.println(distances.size());

        int max = 0;
        int a = k + 1;
        // if (distances.size() > a) {
        for (int i = 0; i < distances.size() - a; i++) {
            out.printf("%d %d%n", distances.get(i + a).start, distances.get(i).end);
            max = Math.max(max, distances.get(i + a).start - distances.get(i).end - 1);
        }
        // } else {

        // }
        out.println(max);
    }
}

class Distance {
    public int start;
    public int end;
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