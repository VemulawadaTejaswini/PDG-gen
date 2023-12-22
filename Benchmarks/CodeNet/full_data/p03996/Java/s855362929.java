import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.StringTokenizer;

/**
 * Created by Aksenov239 on 24.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    BufferedReader br;
    StringTokenizer st;
    PrintWriter out;

    public String nextToken() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }

    public int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }

    public class Pair implements Comparable<Pair> {
        int x, id;
        public Pair(int x, int id) {
            this.x = x;
            this.id = id;
        }
        public int compareTo(Pair p) {
            return p.id == id ? x - p.x : id - p.id;
        }

        public String toString() {
            return x + " " + id;
        }
    }

    public void solve() throws IOException {
        int n = nextInt();
        int m = nextInt();
        int q = nextInt();
        int[] a = new int[q];
        for (int i = 0; i < q; i++) {
            a[q - i - 1] = nextInt();
        }
        ArrayList<Integer> b = new ArrayList<Integer>();
        HashMap<Integer, Integer> pos = new HashMap<Integer, Integer>();
        for (int i = 0; i < q; i++) {
            if (!pos.containsKey(a[i])) {
                b.add(a[i]);
                pos.put(a[i], b.size() - 1);
            }
        }
        TreeSet<Pair> seq = new TreeSet<Pair>();
        for (int i = 0; i < m; i++) {
            seq.add(new Pair(i + 1, b.size()));
        }
        for (int i = b.size() - 1; i >= 0; i--) {
            seq.remove(new Pair(b.get(i), b.size()));
            seq.add(new Pair(b.get(i), i));
        }
        int[] s = new int[m];
        int it = 0;
        for (Pair x : seq) {
            s[it++] = x.x;
        }
        it--;
        while (it > 0 && s[it] >= s[it - 1]) {
            it--;
        }
        int[] order = new int[it];
        pos.clear();
        for (int i = 0; i < it; i++) {
            order[i] = b.get(i);
            pos.put(order[i], i);
        }
        int[] waiting = new int[it];
        for (int i = 0; i < q; i++) {
            if (!pos.containsKey(a[i]))
                continue;
            int c = pos.get(a[i]);
            if (c != 0 && waiting[c] == waiting[c - 1]) {
                continue;
            }
            waiting[c]++;
        }
        for (int i = 0; i < it; i++) {
            if (waiting[i] < n) {
                out.println("No");
                return;
            }
        }
        out.println("Yes");
    }

    public void run() {
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);

            solve();

            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
