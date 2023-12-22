import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ABC085BKagamiMochi solver = new ABC085BKagamiMochi();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC085BKagamiMochi {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            out.println(IntStream.range(0, in.nextInt()).map(x -> in.nextInt()).distinct().count());
        }

    }
}

