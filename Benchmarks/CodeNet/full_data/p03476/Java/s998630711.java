import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputReader in = new InputReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = 1;
        Solver s = new Solver();
        for (int i = 1; i <= t; i++) {
            s.solve(i, in, out);
        }
        out.close();
    }

}

class Solver {
    void solve(int test, InputReader in, PrintWriter out) throws IOException {
        int[] primes = new int[(int) (1e5 + 1)];
        for (int i = 2; i < primes.length; i++) {
            if (primes[i] == 0) {
                for (int j = i; j < primes.length; j += i) primes[j] = i;
            }
        }
        int[] ans = new int[primes.length];

        int c = 0;
        for (int i = 0; i < primes.length; i++) {
            if (primes[i] == i) {
                if (primes[(i + 1) / 2] == (i + 1) / 2) {
                    c++;
                }
            }
            ans[i] = c;
        }
        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            int l = in.nextInt() - 1;
            int r = in.nextInt();
            out.println(ans[r] - ans[l]);
        }
    }
}

class InputReader {
    BufferedReader br;
    StringTokenizer st;

    public InputReader() {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = null;
    }

    public String next() {
        while (st == null || !st.hasMoreTokens()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return st.nextToken();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public String nextLine() throws IOException {
        return br.readLine();
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}