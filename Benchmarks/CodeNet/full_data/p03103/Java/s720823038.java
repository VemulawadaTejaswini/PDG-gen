import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.Comparator;
import java.util.Collections;
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
        Taskb solver = new Taskb();
        solver.solve(1, in, out);
        out.close();
    }

    static class Taskb {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            ArrayList<node> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                a.add(new node(in.nextInt(), in.nextInt()));
            }
            Collections.sort(a, new Comparator<node>() {

                public int compare(node o1, node o2) {
                    return (int) (o1.a - o2.a);
                }
            });
            long ans = 0;
            int i = 0;
            while (m > 0) {
                if (m > a.get(i).b) {
                    ans += a.get(i).a * a.get(i).b;
                } else {
                    m = 0;
                    ans += a.get(i).a * m;
                }
                i++;
            }
            out.println(ans);
        }

        class node {
            long a;
            long b;

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

