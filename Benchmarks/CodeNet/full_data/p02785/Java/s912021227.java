import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br;
    static StringTokenizer st;

    public static void main(final String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        long N;
        N = readLong();
        long K;
        K = readLong();
        List<Long> H = new ArrayList<>();
        for(int i = 0 ; i < N ; i++){
                H.add(readLong());
        }

        final Solver solver = new Solver();
        solver.solve(N, K, H);
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
}

class Solver {
    public void solve(long N, long K, List<Long> H) {
        H.sort(Collections.reverseOrder());

        long ans = 0;
        for (int i = (int) K; i < N; i++) {
            ans += H.get(i);
        }
        System.out.println(ans);
    }
}

