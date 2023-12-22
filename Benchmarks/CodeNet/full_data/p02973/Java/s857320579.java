import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.TreeMap;
import java.util.Map;
import java.util.Scanner;

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
        ESequenceDecomposing solver = new ESequenceDecomposing();
        solver.solve(1, in, out);
        out.close();
    }

    static class ESequenceDecomposing {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int cnt = 0;
            TreeMap<Integer, Integer> tm = new TreeMap<>();
            for (int i = 0; i < n; i++) {
                int k = in.nextInt();
                if (tm.lowerKey(k) == null) {
                    cnt++;
                } else {
                    int lk = tm.lowerKey(k);
                    tm.merge(lk, -1, Integer::sum);
                    if (tm.get(lk) == 0) {
                        tm.remove(lk);
                    }
                }
                tm.merge(k, 1, Integer::sum);
            }

            out.println(cnt);

        }

    }
}

