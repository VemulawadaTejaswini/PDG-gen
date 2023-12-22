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
 * @author anand.oza
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
        static final public void solve(int testNumber, InputReader in, PrintWriter out) {
            char[] s = in.next().toCharArray();
            char[] t = in.next().toCharArray();

            TreeSet<Integer>[] index = new TreeSet['z' + 1];
            for (char i = 'a'; i <= 'z'; i++) {
                index[i] = new TreeSet<>();
            }

            for (int i = 0; i < s.length; i++) {
                index[s[i]].add(i);
            }

            int i = -1;
            int wraps = 0;
            for (char c : t) {
                if (index[c].isEmpty()) {
                    out.println(-1);
                    return;
                }

                Integer next = index[c].higher(i);
                if (next == null) {
                    wraps++;
                    next = index[c].first();
                }

                i = next;
            }

            long answer = ((long) s.length) * wraps + i + 1;

            out.println(answer);
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
}

