import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
        EStringsOfImpurity solver = new EStringsOfImpurity();
        solver.solve(1, in, out);
        out.close();
    }

    static class EStringsOfImpurity {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            String x = in.next();
            String y = in.next();
            ArrayList<Integer> a[] = new ArrayList[26];
            for (int i = 0; i < 26; i++) a[i] = new ArrayList<Integer>();
            for (int i = 0; i < x.length(); i++) a[x.charAt(i) - 'a'].add(i);
            int j = 0;
            long count = 0;
            for (int i = 0; i < y.length(); i++) {
                if (a[y.charAt(i) - 'a'].size() == 0) {
                    out.println(-1);
                    return;
                }
                int p = CustomList.upperBound(a[y.charAt(i) - 'a'], 0, a[y.charAt(i) - 'a'].size(), j);
                if (p == a[y.charAt(i) - 'a'].size()) {
                    count += x.length();
                    j = a[y.charAt(i) - 'a'].get(0);
                } else {
                    j = a[y.charAt(i) - 'a'].get(p);
                }

            }
            count += j + 1;
            out.println(count);
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

    }

    static class CustomList {
        public static int upperBound(List<Integer> a, int low, int high, int element) {
            while (low < high) {
                int middle = low + (high - low) / 2;
                if (a.get(middle) > element)
                    high = middle;
                else
                    low = middle + 1;
            }
            return low;
        }

    }
}

