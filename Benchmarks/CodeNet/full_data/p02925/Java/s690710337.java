import java.io.*;
import java.util.*;

public class Main {

    private static FastReader in = new FastReader(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static void solve() {
        int n = in.nextInt();
        Map<Integer, int[]> a = new HashMap<>();
        for (int i=0; i < n; i++) {
            int[] temp = new int[n-1];
            for (int j=0; j < n - 1; j++) {
                temp[j] = in.nextInt() - 1;
            }
            a.put(i, temp);
        }

        // for each player, how many games they have done
        int[] done = new int[n];

        int days = 0;
        int last = 1;
        boolean[] occupied = new boolean[n];
        List<Integer> toRemove = new ArrayList<>();
        List<Integer> fought = new ArrayList<>();

        while (last != 0) {
            last = 0;
            for (Iterator<Integer> iterator = a.keySet().iterator(); iterator.hasNext(); ) {
                int i = iterator.next();
                if (occupied[i] || !a.containsKey(i) || done[i] == n-1) continue;
                int toFight = a.get(i)[done[i]];
                if (!occupied[toFight] && a.get(toFight)[done[toFight]] == i) {
                    done[i]++;
                    done[toFight]++;
                    occupied[i] = true;
                    occupied[toFight] = true;
                    last++;

                    if (done[i] == n - 1) iterator.remove();
                    if (done[toFight] == n - 1) toRemove.add(toFight);
                    fought.add(i);
                    fought.add(toFight);
                    // out.println("Day " + days + ": Fighting player " + i + " and " + toFight);
                }
            }
            days++;

            for (int i : toRemove)
                a.remove(i);
            toRemove.clear();

            for (int i : fought)
                occupied[i] = false;
            fought.clear();
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

    }

}
