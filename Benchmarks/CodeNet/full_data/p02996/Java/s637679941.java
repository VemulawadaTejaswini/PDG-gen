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
        DMegalomania solver = new DMegalomania();
        solver.solve(1, in, out);
        out.close();
    }

    static class DMegalomania {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            ArrayList<DMegalomania.node> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                a.add(new DMegalomania.node(in.nextInt(), in.nextInt()));
            }
            Collections.sort(a, new Comparator<DMegalomania.node>() {

                public int compare(DMegalomania.node o1, DMegalomania.node o2) {
                    return o1.b - o2.b;
                }
            });
            long ans = 0;
            boolean yes = false;
            for (int i = 0; i < n; i++) {
                ans += a.get(i).a;
                if (ans > a.get(i).b) {
                    yes = true;
                    break;
                }
            }
            if (yes) out.println("No");
            else out.println("Yes");
        }

        static class node {
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

