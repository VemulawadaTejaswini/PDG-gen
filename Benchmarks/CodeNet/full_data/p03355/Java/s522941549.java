import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Iterator;
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
        CKThSubstring solver = new CKThSubstring();
        solver.solve(1, in, out);
        out.close();
    }

    static class CKThSubstring {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            String s = in.next();
            int k = in.nextInt();

            TreeSet<String> strings = new TreeSet<>();
            for (int i = 0; i < s.length(); i++) {
                for (int j = i + 1; j <= i + k && j <= s.length(); j++) {
                    strings.add(s.substring(i, j));
                }
            }

            Iterator<String> it = strings.iterator();
            for (int i = 0; i < k - 1; i++) {
                it.next();
            }

            out.println(it.next());
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

