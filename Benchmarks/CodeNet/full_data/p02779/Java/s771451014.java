import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author varunvats32
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CDistinctOrNot solver = new CDistinctOrNot();
        solver.solve(1, in, out);
        out.close();
    }

    static class CDistinctOrNot {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                set.add(in.nextInt());
            }
            if (set.size() == n) {
                out.println("YES");
            } else {
                out.println("NO");
            }
        }

    }
}

