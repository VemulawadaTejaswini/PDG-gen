import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.List;
import java.util.AbstractCollection;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.LinkedList;
import java.util.Comparator;
import java.io.InputStream;

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
        LightScanner in = new LightScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CAlign solver = new CAlign();
        solver.solve(1, in, out);
        out.close();
    }

    static class CAlign {
        public void solve(int testNumber, LightScanner in, PrintWriter out) {
            int n = in.ints();
            LinkedList<Integer> list = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                list.add(in.ints());
            }
            list.sort(Comparator.naturalOrder());
            LinkedList<Integer> list2 = (LinkedList<Integer>) list.clone();

            int c = list.get(n / 2);
            list.remove(n / 2);
            int c2 = list2.get(n / 2 - 1);
            list2.remove(n / 2 - 1);

            out.println(Math.max(getAns(list, c), getAns(list2, c2)));
        }

        private long getAns(LinkedList<Integer> list2, int c2) {
            long ans = 0;
            while (!list2.isEmpty()) {
                int a;
                if (c2 - list2.getFirst() < list2.getLast() - c2) {
                    a = list2.pollLast();
                } else {
                    a = list2.pollFirst();
                }
                // System.out.println("TAKING " + a);
                ans += Math.abs(c2 - a);
                c2 = a;
            }
            return ans;
        }

    }

    static class LightScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public LightScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }

        public String string() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int ints() {
            return Integer.parseInt(string());
        }

    }
}

