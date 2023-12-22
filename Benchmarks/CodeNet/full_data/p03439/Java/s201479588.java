import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
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
        VacantSeat solver = new VacantSeat();
        solver.solve(1, in, out);
        out.close();
    }

    static class VacantSeat {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            char[] states = new char[n];
            int l = 0, r = n - 1;
            out.println(r);
            out.flush();
            states[r] = in.next().charAt(0);
            if (states[r] == 'V') return;
            out.println(l);
            out.flush();
            states[l] = in.next().charAt(0);
            if (states[l] == 'V') return;
            int asks = 2;
            while (l <= r) {
                int m = (l + r) >> 1;
                asks++;
                if ((states[m] = ask(m, in, out)) == 'V') return;
                if (states[m] == states[l] && (m - l) % 2 == 1) r = m - 1;
                if (states[m] == states[r] && (r - m) % 2 == 1) l = m + 1;
                if (states[m] != states[r] && (r - m) % 2 == 0) l = m + 1;
                if (states[m] != states[l] && (m - l) % 2 == 0) r = m - 1;
            }
            for (int i = 0; i < n && asks <= 20; i++) {
                if (states[i] == '?') {
                    asks++;
                    if ((states[i] = ask(i, in, out)) == 'V') return;
                }
            }
        }

        char ask(int i, InputReader in, PrintWriter out) {
            out.println(i);
            out.flush();
            return in.next().charAt(0);
        }

    }

    static class InputReader {
        private StringTokenizer tokenizer;
        private BufferedReader reader;

        public InputReader(InputStream inputStream) {
            reader = new BufferedReader(new InputStreamReader(inputStream));
        }

        private void fillTokenizer() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }

        public String next() {
            fillTokenizer();
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

