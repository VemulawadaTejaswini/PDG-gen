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
 *
 * @author rizhiy
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }
 
    static class TaskB {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = in.nextInt();
            for (int i = 0; i < n; i++) {
                b[i] = in.nextInt();
            }
            int ca = 0;
            int cb = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] == b[i]) continue;
                if (a[i] % 2 != b[i] % 2) {
                    b[i]++;
                    cb++;
                }
                if (a[i] > b[i]) {
                    cb += (a[i] - b[i]);
                }
                if (b[i] > a[i]) {
                    ca += (b[i] - a[i]) / 2;
                }
            }
//        out.println(ca);
//        out.println(cb);
            if (cb == ca) {
                out.println("Yes");
                return;
            } else {
                out.println("No");
                return;
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
 