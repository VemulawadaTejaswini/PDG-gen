import java.io.*;
import java.util.*;

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
        int[][] a = new int[n][n-1];
        for (int i=0; i < n; i++) {
            for (int j=0; j < n - 1; j++) {
                a[i][j] = in.nextInt() - 1;
            }
        }

        // for each player, how many games they have done
        int[] done = new int[n];

        int days = 0;
        int last = 1;
        boolean[] occupied = new boolean[n];
        List<Integer> fought = new ArrayList<>();
        List<Integer> toAdd = new ArrayList<>();
        Set<Integer> toCheck = new HashSet<>();
        for (int i=0; i < n; i++)
            toCheck.add(i);

        while (last != 0) {
            last = 0;
            // out.println("To check: " + toCheck);
            for (Iterator<Integer> iterator = toCheck.iterator(); iterator.hasNext(); ) {
                int i = iterator.next();
                if (occupied[i] || done[i] == n - 1) continue;
                int toFight = a[i][done[i]];
                if (!occupied[toFight] && a[toFight][done[toFight]] == i) {
                    done[i]++;
                    done[toFight]++;
                    occupied[i] = true;
                    occupied[toFight] = true;
                    last++;

                    if (done[i] != n - 1) toAdd.add(i);
                    // if (done[toFight] != n - 1) toAdd.add(toFight);
                    fought.add(i);
                    fought.add(toFight);
                    // out.println("Day " + days + ": Fighting player " + i + " and " + toFight);
                    // out.flush();
                } else if (a[toFight][done[toFight]] != i) {
                    // out.println("Removing " + i);
                    iterator.remove();
                }
            }
            days++;

            for (int i : fought)
                occupied[i] = false;
            fought.clear();

            for (int i : toAdd)
                toCheck.add(i);
            toAdd.clear();
        }

        out.println(check(done, n) ? days - 1 : -1);
    }

    private static boolean check(int[] done, int n) {
        for (int d : done) {
            if (d != n - 1)
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
