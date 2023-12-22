import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.InputMismatchException;
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
            int[] cnt = new int[26];

            int h = in.nextInt();
            int w = in.nextInt();
            String[] s = in.nextStringArray(h);

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    cnt[s[i].charAt(j) - 'a']++;
                }
            }

            int cnt1 = 0;
            int cnt2 = 0;
            for (int i = 0; i < 26; i++) {
                int x = cnt[i] % 4;
                if (x >= 2) {
                    cnt2++;
                    x -= 2;
                }

                if (x >= 1) {
                    cnt1++;
                }
            }

            int can1 = 0;
            if (h % 2 == 1 && w % 2 == 1) can1++;

            int can2 = 0;
            if (h % 2 == 1 && w % 2 == 1) {
                can2 += h / 2 + w / 2;
            } else if (h % 2 == 1) {
                can2 += w / 2;
            } else if (w % 2 == 1) {
                can2 += h / 2;
            }

            out.println(can1 >= cnt1 && can2 >= cnt2 ? "Yes" : "No");
        }

    }

    static class InputReader {
        BufferedReader in;
        StringTokenizer tok;

        public String nextString() {
            while (!tok.hasMoreTokens()) {
                try {
                    tok = new StringTokenizer(in.readLine(), " ");
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
            }
            return tok.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(nextString());
        }

        public String[] nextStringArray(int n) {
            String[] res = new String[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextString();
            }
            return res;
        }

        public InputReader(InputStream inputStream) {
            in = new BufferedReader(new InputStreamReader(inputStream));
            tok = new StringTokenizer("");
        }

    }
}

