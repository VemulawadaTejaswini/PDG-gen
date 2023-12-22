import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.HashMap;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BProblemSet solver = new BProblemSet();
        solver.solve(1, in, out);
        out.close();
    }

    static class BProblemSet {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            HashMap<Integer, Integer> hm = new HashMap<>();
            for (int i = 0; i < n; i++) {
                hm.merge(in.nextInt(), 1, Integer::sum);
            }
            int m = in.nextInt();
            for (int i = 0; i < m; i++) {
                int need = in.nextInt();
                if (hm.containsKey(need) && hm.get(need) > 0) {
                    hm.merge(need, -1, Integer::sum);
                } else {
                    out.println("NO");
                    return;
                }
            }
            out.println("YES");


        }

    }
}

