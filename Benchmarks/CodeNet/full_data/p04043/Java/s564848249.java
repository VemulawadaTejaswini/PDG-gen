import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

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
        abc042_a solver = new abc042_a();
        solver.solve(1, in, out);
        out.close();
    }

    static class abc042_a {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            List list = Arrays.asList(in.nextInt(), in.nextInt(), in.nextInt());
            Collections.sort(list);
            out.append(list.contains(Arrays.asList(5, 5, 7)) ? "YES" : "NO");
        }

    }
}

