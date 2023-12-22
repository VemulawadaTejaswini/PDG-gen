import java.io.*;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        FastReader scan = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        Task solver = new Task();
        int t = 1;
        while (t --> 0) solver.solve(1, scan, out);
        out.close();
    }

    static class Task {
        static long[][] dp;
        static Item[] items;
        static int n, t;

        public void solve(int testNumber, FastReader scan, PrintWriter out) {
            n = scan.nextInt();
            t = scan.nextInt();
            items = new Item[n];
            dp = new long[n][t];
            for(int i = 0; i < n; i++) {
                items[i] = new Item(scan.nextInt(), scan.nextInt());
                Arrays.fill(dp[i], -1);
            }
            Arrays.sort(items);
            out.println(go(0, 0));
        }

        static class Item implements Comparable<Item> {
            int a;
            int b;

            public Item(int aa, int bb) {
                a = aa;
                b = bb;
            }

            @Override
            public int compareTo(Item o) {
                return Integer.compare(a, o.a);
            }
        }

        static long go(int at, int time) {
            if(time >= t || at >= n) return 0;
            if(dp[at][time] != -1) return dp[at][time];
            return dp[at][time] = Math.max(items[at].b+go(at+1, time+items[at].a), go(at+1, time));
        }
    }

    static void shuffle(int[] a) {
        Random get = new Random();
        for (int i = 0; i < a.length; i++) {
            int r = get.nextInt(a.length);
            int temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }

    static void shuffle(long[] a) {
        Random get = new Random();
        for (int i = 0; i < a.length; i++) {
            int r = get.nextInt(a.length);
            long temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastReader(String s) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(new File(s)));
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