import java.util.*;
import java.io.*;

public class Main {
    static HashSet<Long> factors;
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = sc.nextInt(); long k = sc.nextLong();
        int [] a = new int[n]; long sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        factors = new HashSet<>();
        factorize(sum); long res = 1;
        for (Long f: factors) {
            long [] up = new long[n];
            long [] down = new long[n];
            long cur = 0; long delta = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] % f == 0) {
                    cur += a[i];
                    up[i] = f; down[i] = f;
                } else {
                    long below = a[i] / f * f;
                    long above = below + f;
                    if (above - a[i] <= a[i] - below) {
                        delta += above - a[i];
                        cur += above;
                        up[i] = f; down[i] = (a[i] - below) - (above - a[i]);
                    } else {
                        delta += a[i] - below;
                        cur += below;
                        down[i] = f; up[i] = (above - a[i]) - (a[i] - below);
                    }
                }
            }
            if (cur == sum) {
                if (delta <= 2 * k) res = Math.max(res, f);
            } else if (cur < sum) {
                ArrayList<Pair> changes = new ArrayList<>();
                for (int i = 0; i < n; i++) if (up[i] != f) changes.add(new Pair(i, up[i]));
                Collections.sort(changes);
                long jumps = (sum - cur) / f; long left = jumps;
                for (int i = 0; i < Math.min(jumps, changes.size()); i++) {
                    delta += changes.get(i).delta;
                    --left;
                }
                if (left != 0) {
                    delta += left * f;
                }
                if (delta <= 2 * k) res = Math.max(res, f);
            } else {
                ArrayList<Pair> changes = new ArrayList<>();
                for (int i = 0; i < n; i++) if (down[i] != f) changes.add(new Pair(i, down[i]));
                Collections.sort(changes);
                long jumps = (cur - sum) / f; long left = jumps;
                for (int i = 0; i < Math.min(jumps, changes.size()); i++) {
                    delta += changes.get(i).delta;
                    --left;
                }
                if (left != 0) {
                    delta += left * f;
                }
                if (delta <= 2 * k) res = Math.max(res, f);
            }
        }
        out.println(res);
        out.close();
    }

    static class Pair implements Comparable<Pair> {
        int idx; long delta;
        Pair (int idx, long delta) {
            this.idx = idx; this.delta = delta;
        }

        @Override
        public int compareTo(Pair o) {
            if (delta == o.delta) return Integer.compare(idx, o.idx);
            return Long.compare(delta, o.delta);
        }
    }

    static void factorize(long x) {
        for (int i = 2; i <= Math.sqrt(x) + 1; i++) {
            if (x % i == 0) {
                factors.add((long)i);
                factors.add(x / i);
            }
        }
        factors.add(x);
    }


    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }


    }

}