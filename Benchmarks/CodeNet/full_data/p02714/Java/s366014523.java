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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            String str = in.next();
            int[] sufR = suf(n, str, 'R');
            int[] sufG = suf(n, str, 'G');
            int[] sufB = suf(n, str, 'B');
            long ans = 0;
            for (int i = 0; i + 2 < n; i++)
                for (int j = i + 1; j + 1 < n; j++) {
                    char f = str.charAt(i);
                    char s = str.charAt(j);
                    if (f != s) {
                        ans += sum(n, f, s, j + 1, sufR, sufG, sufB);
                        int dif = j - i;
                        int pos = j + dif;
                        if (pos < n && str.charAt(pos) == rest(f, s))
                            ans--;
                    }
                }
            out.println(ans);
        }

        int[] suf(int n, String s, char c) {
            int[] suf = new int[n];
            if (s.charAt(n - 1) == c)
                suf[n - 1] = 1;
            for (int i = n - 2; i >= 0; i--)
                if (s.charAt(i) == c)
                    suf[i] = suf[i + 1] + 1;
                else
                    suf[i] = suf[i + 1];
            return suf;
        }

        char rest(char f, char s) {
            String str = f + Character.toString(s);
            if (!str.contains("R"))
                return 'R';
            if (!str.contains("G"))
                return 'G';
            return 'B';
        }

        int sum(int n, char f, char s, int i, int[] sufR, int[] sufG, int[] sufB) {
            String str = f + Character.toString(s);
            if (!str.contains("R"))
                return sufR[i];
            if (!str.contains("G"))
                return sufG[i];
            return sufB[i];
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

