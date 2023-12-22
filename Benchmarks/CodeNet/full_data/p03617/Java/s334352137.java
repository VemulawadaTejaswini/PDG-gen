import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (InputReader in = new InputReader(); PrintWriter out = new PrintWriter(System.out)) {
            new Main().solve(in, out);
            out.flush();
        }
    }

    void solve(InputReader in, PrintWriter out) {
        long[] sizes = { 25, 50, 100, 200 };
        Queue<Tee> queue = new PriorityQueue<>();
        for (int i = 0; i < 4; i++) {
            long cost = in.nextLong();
            queue.add(new Tee(cost, sizes[i]));
        }
        long N = in.nextLong() * 100;

        long ans = 0;
        long tmpSize = 0;
        for (Tee t : queue) {
            while (true) {
                if (tmpSize + t.size > N) {
                    break;
                }

                tmpSize += t.size;
                ans += t.cost;
            }
        }

        out.println(ans);
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
