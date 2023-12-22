import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            ArrayList<node> a[] = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                int x = in.nextInt();
                a[i] = new ArrayList<>();
                for (int j = 0; j < x; j++) {
                    a[i].add(new node(in.nextInt() - 1, in.nextInt()));
                }
            }
            int max = 0;
            HashSet<Integer> hs = new HashSet<>();
            for (int i = 0; i < (1 << n); i++) {
                hs.clear();
                for (int j = 0; j < n; j++) {
                    if ((i & (1 << j)) > 0) hs.add(j);
                }
                int ans = 1;

                for (int x : hs) {
                    for (node temp : a[x]) {
                        if (temp.b == 0) {
                            if (hs.contains(temp.a))
                                ans = 0;
                        } else {
                            if (!hs.contains(temp.a)) ans = 0;
                        }
                    }
                }
                if (ans == 1) max = Math.max(max, hs.size());
            }
            out.println(max);
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

