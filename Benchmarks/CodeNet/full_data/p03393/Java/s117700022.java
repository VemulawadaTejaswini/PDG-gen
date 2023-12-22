import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            String s = in.next();
            {
                String t = findDiverseEnding(s, s.length() + 1);
                if (t != null) {
                    out.println(t);
                    return;
                }
            }
            for (int i = s.length() - 1; i >= 0; --i) {
                for (int ch = s.charAt(i) + 1; ch <= 'z'; ++ch) {
                    String t = s.substring(0, i) + (char) ch;
                    t = findDiverseEnding(t, t.length());
                    if (t != null) {
                        out.println(t);
                        return;
                    }
                }
            }
            if (s.length() < 26) {
                String t = "";
                for (int i = 0; i <= s.length(); ++i) {
                    t += (char) ('a' + i);
                }
                out.println(t);
            } else {
                out.println(-1);
            }
        }

        private String findDiverseEnding(String s, int length) {
            int[] cnt = new int[26];
            for (char ch : s.toCharArray()) ++cnt[ch - 'a'];
            for (int x : cnt) if (x >= 2) return null;
            for (int i = 0; i < 26 && s.length() < length; ++i)
                if (cnt[i] == 0) {
                    s += (char) ('a' + i);
                }
            if (s.length() < length) return null;
            return s;
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

