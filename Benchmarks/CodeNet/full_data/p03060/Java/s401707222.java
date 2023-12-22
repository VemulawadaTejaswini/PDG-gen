import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        try (InputReader in = new InputReader(); PrintWriter out = new PrintWriter(System.out)) {
            new Main().solve(in, out);
        }
    }

    private void solve(InputReader in, PrintWriter out) {
        int n = in.nextInt();
        in.nextLine();

        List<Integer> vs = Arrays.stream(in.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> cs = Arrays.stream(in.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int ans = IntStream.range(0, 1 << n)
                .map(i -> IntStream.range(0, n)
                    .map(j -> (((i >> j) & 1) == 1) ? vs.get(j) - cs.get(j) : 0)
                    .sum()
                )
                .max()
                .getAsInt();
        out.println(ans);
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

    String nextLine() {
        return this.sc.nextLine();
    }

    @Override
    public void close() {
        this.sc.close();
    }
}
