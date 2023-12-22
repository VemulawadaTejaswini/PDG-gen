import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Comparator;
import java.io.InputStreamReader;
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
        DSummerVacation solver = new DSummerVacation();
        solver.solve(1, in, out);
        out.close();
    }

    static class DSummerVacation {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            node[] a = new node[n];
            for (int i = 0; i < n; i++) a[i] = new node(in.nextInt(), in.nextInt());
            Arrays.sort(a, new Comparator<node>() {

                public int compare(node o1, node o2) {
                    return (o2.b - o1.b) != 0 ? (o2.b - o1.b) : o2.a - o1.a;
                }
            });
            int count = 0;
            long reward = 0;
            for (int i = 0; i < n; i++) {
                if (a[i].a + count <= m) {
                    reward += a[i].b;
                    count++;
                }
            }
            out.println(reward);
        }

        class node {
            int a;
            int b;

            node(int a, int b) {
                this.a = a;
                this.b = b;
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

