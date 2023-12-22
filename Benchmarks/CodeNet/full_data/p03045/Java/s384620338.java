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
 * @author Jaynil
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        E1Or2 solver = new E1Or2();
        solver.solve(1, in, out);
        out.close();
    }

    static class E1Or2 {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            DSet d = new DSet(n);
            for (int i = 0; i < m; i++) {
                d.union(in.nextInt(), in.nextInt());
                int temp = in.nextInt();
            }
            out.println(d.getClusters());
        }

    }

    static class DSet {
        int parent[];
        int rank[];
        int size;

        DSet(int n) {
            parent = new int[n + 1];
            rank = new int[n + 1];
            size = n;
            for (int i = 0; i <= n; i++) {
                this.parent[i] = i;
            }
        }

        public int find(int i) {
            if (parent[i] == i) return i;
            else {
                int result = find(parent[i]);
                parent[i] = result;
                return result;
            }
        }

        public int getClusters() {
            return size;
        }

        public void union(int i, int j) {
            int ipar = this.find(i);
            int jpar = this.find(j);
            if (ipar == jpar) {
                return;
            }
            int irank = this.rank[ipar];
            int jrank = this.rank[jpar];
            if (irank < jrank) {
                this.parent[ipar] = jpar;
            } else if (jrank < irank) {
                this.parent[jpar] = ipar;
            } else {
                this.parent[ipar] = jpar;
                this.rank[jpar]++;
            }
            size--;
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

