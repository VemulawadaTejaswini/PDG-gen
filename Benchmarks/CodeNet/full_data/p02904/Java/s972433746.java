import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeSet;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Jaynil
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BSortingASegment solver = new BSortingASegment();
        solver.solve(1, in, out);
        out.close();
    }

    static class BSortingASegment {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            int a[] = new int[n];
            TreeSet<Integer> ans = new TreeSet<>();
            int c = 0;
            TreeSet<Integer> ts = new TreeSet<>();
            int p = 0;
            for (int i = 0; i < n; i++) a[i] = in.nextInt();
            for (int i = 0; i < k; i++) {
                ts.add(a[i]);
            }
            for (int i = k; i < n; i++) {
                int min = ts.first();
                int max = ts.last();
                ts.add(a[i]);
                int nmax = ts.last();
                int nmin = ts.first();
                if (nmax != max && nmin != min) {
                    ans.add(c);
                } else {
//                out.println(i-k);
                    c++;
                    ans.add(c);
                }
                ts.remove(a[p]);
                p++;
            }
            if (ans.size() == 0) ans.add(0);
            out.println(ans.size());
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

