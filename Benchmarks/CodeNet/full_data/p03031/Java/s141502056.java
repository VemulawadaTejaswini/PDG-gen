
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br;
    static StringTokenizer st;

    public static void main(final String[] args) {
        br = new BufferedReader(new InputStreamReader(System.in));

        try {
            final int N = readInt();
            final int M = readInt();

            // final List<Integer> lights = new ArrayList<>();
            final Integer[] lights = new Integer[N];

            final List<List<Integer>> s = new ArrayList<>();
            for (int i = 0; i < M; i++) {
                s.add(new ArrayList<>());

                final int k = readInt();
                for (int j = 0; j < k; j++) {
                    s.get(i).add(readInt() - 1);
                }
            }

            final List<Integer> p = new ArrayList<>();
            for (int i = 0; i < M; i++) {
                p.add(readInt());
            }

            final Solver solver = new Solver();

            System.out.println(solver.solve(N, M, s, p));

        } catch (final IOException e) {
            e.printStackTrace();
        }
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }

    static long readLong() throws IOException {
        return Long.parseLong(next());
    }

    static int readInt() throws IOException {
        return Integer.parseInt(next());
    }

    static double readDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static char readCharacter() throws IOException {
        return next().charAt(0);
    }

    static String readLine() throws IOException {
        return br.readLine().trim();
    }
}

class Solver {
    public int solve(
            final int N,
            final int M,
            final List<List<Integer>> s,
            final List<Integer> p
    ) {
        int ans = 0;

        for (int i = 0; i < (1 << N); i++) {
            boolean ok = true;

            for (int j = 0; j < M; j++) {
                int c = 0;

                for (final Integer light : s.get(j)) {
                    if (((i >> light) & 1) == 1) {
                        c++;
                    }
                }

                if (c % 2 != p.get(j)) {
                    ok = false;
                    break;
                }
            }

            if (ok) {
                ans++;
            }
        }
        return ans;
    }
}
