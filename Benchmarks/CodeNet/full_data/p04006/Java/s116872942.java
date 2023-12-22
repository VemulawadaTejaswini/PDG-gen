import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = sc.nextInt(); long x = sc.nextLong();
        Pair [] a = new Pair[n];
        Pair [] b = new Pair[n];
        for (int i = 0; i < n; i++) {
            a[i] = new Pair(i, sc.nextLong());
            b[i] = a[i];
        }
        Arrays.sort(a, Comparator.comparingLong(c -> c.cost));
        long ans = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            Set<Integer> produce = new HashSet<>();
            int start = -1;
            for (int j = 0; j < i + 1; j++) {
                produce.add(a[j].idx);
                start = a[j].idx;
            }
            int p = start; int cur = (start + 1) % n; int run = 0; int max = 0;
            long total = b[start].cost;
            while (cur != start) {
                if (produce.contains(cur)) {
                    max = Math.max(run, max);
                    run = 0;
                    p = cur;
                } else {
                    run++;
                }
                total += b[p].cost;
                cur = (cur + 1) % n;
            }
            max = Math.max(run, max);
            total += x * max;
            ans = Math.min(ans, total);
        }
        out.println(ans);
        out.close();
    }

    static class Pair {
        int idx; long cost;
        Pair(int idx, long cost) {
            this.idx = idx; this.cost = cost;
        }
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