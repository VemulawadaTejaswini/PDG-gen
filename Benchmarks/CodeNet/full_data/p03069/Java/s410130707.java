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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            String s = in.next();
            int cp = 0, cr = 0;
            int[] cpAr = new int[n];
            if (s.charAt(0) == '.')
                cpAr[0] = 1;
            for (int i = 0; i < n; i++) {
                if (i > 0) {
                    if (s.charAt(i) == '.')
                        cpAr[i] = cpAr[i - 1] + 1;
                    else
                        cpAr[i] = cpAr[i - 1];
                }
                if (s.charAt(i) == '.')
                    cp++;
                else
                    cr++;
            }
            int[] crAr = new int[n];
            if (s.charAt(n - 1) == '#')
                crAr[n - 1] = 1;
            for (int i = n - 2; i >= 0; i--)
                if (s.charAt(i) == '#')
                    crAr[i] = crAr[i + 1] + 1;
                else
                    crAr[i] = crAr[i + 1];
            if (cr == 0)
                out.println(0);
            else {
                int min1 = Math.min(cp, cr);
                int min = Integer.MAX_VALUE;
                for (int i = 0; i < n; i++) {
                    int pLeft = cpAr[i];
                    int leftLen = i + 1;
                    int rRight = 0, rightLen = 0;
                    if (i + 1 < n) {
                        rRight = crAr[i + 1];
                        rightLen = n - (i + 1);
                    }
                    int cur = (leftLen - pLeft) + (rightLen - rRight);
                    min = Math.min(cur, min);
                }
                out.println(Math.min(min1, min));
            }
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