import java.io.*;
import java.util.*;

public class Main {

    class Pair implements Comparable<Pair> {
        int x, y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Pair o) {

            if (c[o.x] >= c[x] && c[o.y] <= c[y]) {
                return -1;
            } else {
                return Integer.compare(x, o.x);
            }

        }
    }

    int n;
    int p[], next[], pr[], c[];
    boolean used[];

    int getNext(int i) {
        if (next[i] == -1) return -1;
        if (used[next[i]]) {
            next[i] = getNext(next[i]);
        }
        return next[i];
    }

    int getPr(int i) {
        if (pr[i] == -1) return -1;
        if (used[pr[i]]) {
            pr[i] = getPr(pr[i]);
        }
        return pr[i];
    }

    public void solve() throws IOException {
        n = nextInt();
        p = new int[n];
        c = new int[n + 1];
        for (int i = 0; i < n; i++) {
            p[i] = nextInt();
            c[p[i]] = i;
        }
        used = new boolean[n + 1];
        next = new int[n + 1];
        pr = new int[n + 1];
        for (int i = 0; i < n; i++) {
            if (i > 0) {
                pr[p[i]] = p[i - 1];
            } else {
                pr[p[i]] = -1;
            }
            if (i < n - 1) {
                next[p[i]] = p[i + 1];
            } else {
                next[p[i]] = -1;
            }
        }
        int cr = n - 1;
        ArrayList<Pair> res = new ArrayList<>();
        for (int q = n; q > 0; q--) {
            if (used[q]) continue;
            used[q] = true;
            int a = getNext(q);
            int b = getPr(q);
            if (a == -1) {
                used[b] = true;
                res.add(new Pair(b, q));
            } else if (b == -1) {
                used[a] = true;
                res.add(new Pair(q, a));
            } else if (a > b) {
                used[a] = true;
                res.add(new Pair(q, a));
            } else {
                used[b] = true;
                res.add(new Pair(b, q));
            }
        }
        Collections.sort(res);
        for (int i = 0; i < res.size(); i++) {
            out.print(res.get(i).x + " " + res.get(i).y + " ");
        }
    }


    BufferedReader br;
    StringTokenizer sc;
    PrintWriter out;

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        new Main().run();
    }

    void run() throws IOException {
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
//            br = new BufferedReader(new FileReader("sum2.in"));
//            out = new PrintWriter(new File("sum2.out"));
            solve();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    String nextToken() throws IOException {
        while (sc == null || !sc.hasMoreTokens()) {
            try {
                sc = new StringTokenizer(br.readLine());
            } catch (Exception e) {
                return null;
            }
        }
        return sc.nextToken();
    }

    int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }

    long nextLong() throws IOException {
        return Long.parseLong(nextToken());
    }
}