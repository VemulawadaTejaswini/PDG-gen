import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.Comparator;
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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        int[] st;
        ArrayList<Integer>[] g;
        ArrayList<Integer> p;
        boolean[] used;
        long answ = 0;

        void dfs(int v) {
            p.add(st[v]);
            used[v] = true;
            for (int to : g[v]) {
                if (!used[to]) {
                    dfs(to);
                }
            }
        }

        int[] marg(int[] a, int[] b) {
            answ += (long) a[0] + (long) b[0];
            ArrayList<Integer> p = new ArrayList<>();
            int i = 1;
            int j = 1;
            while (true) {
                if (i < a.length && j < b.length) {
                    if (a[i] < b[j]) {
                        p.add(a[i]);
                        i++;
                    } else {
                        p.add(b[j]);
                        j++;
                    }
                } else if (i < a.length && j >= b.length) {
                    p.add(a[i]);
                    i++;
                } else if (i >= a.length && j < b.length) {
                    p.add(b[j]);
                    j++;
                } else {
                    break;
                }
            }
            int[] k = new int[p.size()];
            for (int ii = 0; ii < p.size(); ii++) {
                k[ii] = p.get(ii);
            }
            Arrays.sort(k);
            return k;
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            st = new int[n];
            for (int i = 0; i < n; i++) {
                st[i] = in.nextInt();
            }
            g = new ArrayList[n];
            used = new boolean[n];
            for (int j = 0; j < n; j++) {
                g[j] = new ArrayList<>();
            }
            for (int i = 0; i < m; i++) {
                int x = in.nextInt();
                int y = in.nextInt();
                g[x].add(y);
                g[y].add(x);
            }
            TreeSet<int[]> treeSet = new TreeSet<>(new Comparator<int[]>() {

                public int compare(int[] o1, int[] o2) {
                    if (o1.length != o2.length) return o1.length - o2.length;
                    return o1[0] - o2[0];
                }
            });
            for (int i = 0; i < n; i++) {
                if (!used[i]) {
                    p = new ArrayList<>();
                    dfs(i);
                    int[] k = new int[p.size()];
                    for (int j = 0; j < p.size(); j++) {
                        k[j] = p.get(j);
                    }
                    Arrays.sort(k);
                    treeSet.add(k);
                }
            }
            while (true) {
                if (treeSet.size() == 1) break;
                TreeSet<int[]> tr = new TreeSet<>(new Comparator<int[]>() {

                    public int compare(int[] o1, int[] o2) {
                        if (o1.length != o2.length) return o1.length - o2.length;
                        return o1[0] - o2[0];
                    }
                });
                while (true) {
                    if (treeSet.size() <= 1) break;
                    int[] a = treeSet.pollFirst();
                    int[] b = treeSet.pollFirst();
                    int[] o = marg(a, b);
                    if (o.length < 1) {
                        out.println("Impossible");
                        return;
                    }
                    tr.add(o);
                }
                treeSet = tr;
            }
            out.println(answ);
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

