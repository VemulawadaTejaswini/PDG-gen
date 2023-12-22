import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            int a[][] = new int[m][2];
            for (int i = 0; i < m; i++) {
                a[i][0] = in.nextInt();
                a[i][1] = in.nextInt();
            }
            DSet d = new DSet(n);
            long temp = ((long) n * (long) (n - 1)) / 2;
            ArrayList<Long> ans = new ArrayList<>();
            ans.add(temp);
            for (int i = m - 1; i >= 0; i--) {
                int p = d.size;
                long temp2 = (long) d.csize[d.find(a[i][0])] * (long) d.csize[d.find(a[i][1])];
//            out.println(d.csize[d.find(a[i][0])] + " " + d.csize[d.find(a[i][1])]);
                d.union(a[i][0], a[i][1]);
                int q = d.size;
                if (p != q) {
                    temp -= temp2;
                }
                ans.add(temp);
            }
            for (int i = m - 1; i >= 0; i--) {
                out.println(ans.get(i));
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

    static class DSet {
        int parent;
        int rank;
        int csize;
        int size;

        DSet(int n) {
            parent = new int[n + 1];
            rank = new int[n + 1];
            csize = new int[n + 1];
            size = n;
            for (int i = 0; i <= n; i++) {
                this.parent[i] = i;
                this.csize[i] = 1;
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
                this.csize[jpar] += this.csize[ipar];
            } else if (jrank < irank) {
                this.parent[jpar] = ipar;
                this.csize[ipar] += this.csize[jpar];
            } else {
                this.parent[ipar] = jpar;
                this.csize[jpar] += this.csize[ipar];
                this.rank[jpar]++;
            }
            size--;
        }

    }
}

