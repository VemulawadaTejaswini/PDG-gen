import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    private static FastReader in = new FastReader(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    private static final long MOD = (long) 1e9 + 7;

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static void solve() {
        int n = in.nextInt();
        Queue<Integer>[] a = new ArrayDeque[n];
        for (int i=0; i < a.length; i++) {
            a[i] = new ArrayDeque<>();
            for (int j=0; j < n - 1; j++) {
                a[i].add(in.nextInt() - 1);
            }
        }

        int days = 0;
        int last = 1;
        boolean[] occupied = new boolean[n];
        while (last != 0) {
            last = 0;
            for (int i=0; i < n; i++) {
                if (a[i].isEmpty() || occupied[i]) continue;
                int toFight = a[i].peek();
                if (!occupied[toFight] && !a[toFight].isEmpty() && a[toFight].peek() == i) {
                    a[i].poll();
                    a[toFight].poll();
                    occupied[i] = true;
                    occupied[toFight] = true;
                    last++;
                    // out.println("Day " + days + ": Fighting player " + i + " and " + toFight);
                }
            }
            days++;

            occupied = new boolean[n];
        }

        out.println(check(a, n) ? days - 1 : -1);
    }

    private static boolean check(Queue<Integer>[] a, int n) {
        for (Queue<Integer> d : a) {
            if (!d.isEmpty())
                return false;
        }
        return true;
    }

    // https://www.geeksforgeeks.org/fast-io-in-java-in-competitive-programming/
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader(InputStream inputStream) {
            br = new BufferedReader(new
                    InputStreamReader(inputStream));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException  e) {
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

        // https://qiita.com/masakinpo/items/5f77f2a879578a85a0bb
        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        public long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }

}
