import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.stream.Stream;
import java.util.Collection;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BKagamiMochi solver = new BKagamiMochi();
        solver.solve(1, in, out);
        out.close();
    }

    static class BKagamiMochi {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = Integer.parseInt(in.next());
            List<Integer> l = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                l.add(Integer.parseInt(in.next()));
            }
            long ans = l.stream().sorted().distinct().count();
            out.println(ans);
        }

    }
}

