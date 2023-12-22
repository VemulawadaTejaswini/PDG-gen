import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.AbstractCollection;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskF solver = new TaskF();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskF {
        int[] val;
        List<Integer>[] tree;
        int[] c;
        int[] sum;
        int[] size;

        void go(int u) {
            int count0 = 0;
            size[u] = val[u];
            for (int i : tree[u]) {
                go(i);
                if (val[i] == 0) {
                    count0 += sum[i];
                }
                size[u] += size[i];
            }
            if (val[u] == 1) {
                c[u] = count0;
            } else {
                sum[u] = count0 + 1;
            }
        }

        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] parent = new int[n + 1];
            parent[1] = 0;
            for (int i = 2; i <= n; i++) {
                parent[i] = in.nextInt();
            }
            val = new int[n + 1];
            val[0] = 1;
            for (int i = 1; i <= n; i++) {
                val[i] = in.nextInt();
            }
            n++;
            tree = new List[n];
            for (int i = 0; i < n; i++) {
                tree[i] = new ArrayList<>();
            }
            for (int i = 1; i < n; i++) {
                tree[parent[i]].add(i);
            }
            c = new int[n];
            sum = new int[n];
            size = new int[n];
            go(0);
            int[] sumC = c.clone();
            for (int i = n - 1; i > 0; i--) {
                sumC[parent[i]] += sumC[i];
            }
            PriorityQueue<Vertex> q = new PriorityQueue<>();
            q.add(new Vertex(0, sumC[0] - size[0]));
            long result = 0;
            int pos = 0;
            while (!q.isEmpty()) {
                Vertex cur = q.poll();
                if (val[cur.id] == 0) {

                } else {
                    pos++;
                    result += (long) c[cur.id] * pos;
                }
                for (int i : tree[cur.id]) {
                    q.add(new Vertex(i, sumC[i] - size[i]));
                }
            }
            int numZeros = 0;
            for (int i : val) {
                numZeros += (i == 0) ? 1 : 0;
            }
            out.println(result - numZeros);
        }

        class Vertex implements Comparable<Vertex> {
            int id;
            long value;

            public Vertex(int id, long value) {
                this.id = id;
                this.value = value;
            }


            public int compareTo(Vertex o) {
                if (val[id] != val[o.id]) {
                    return Integer.compare(val[id], val[o.id]);
                }
                return -Long.compare(value, o.value);
            }

        }

    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(InputStream in) {
            br = new BufferedReader(new InputStreamReader(in));
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                String line = null;
                try {
                    line = br.readLine();
                } catch (IOException e) {
                }
                st = new StringTokenizer(line);
            }
            return st.nextToken();
        }

    }
}

