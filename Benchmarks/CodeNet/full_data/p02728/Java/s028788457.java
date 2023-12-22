import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeSet;

import javax.swing.*;


import static java.util.Arrays.binarySearch;
import static java.util.Arrays.copyOfRange;

public class Main {

    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;

        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }
}

class Task {

    private static int mod = 1000000007;

    int n;
    int[] cnt;
    long[] ans;
    long[] fac;
    long[] tmp;
    Vectex[] vec;

    public long powMod(long a, long b) {
        long ans = 1, d = a % mod;
        while (b > 0) {
            if (b % 2 == 1) {
                ans = ans * d % mod;
            }
            b >>= 1;
            d = d * d % mod;
        }
        return ans;
    }

    public long getC(int n, int m) {
        return fac[n] * powMod(fac[m], mod - 2) % mod * powMod(fac[n - m], mod - 2) % mod;
    }

    public void solve(int testNumber, InputReader in, PrintWriter out) {
        n = in.nextInt();
        vec = new Vectex[n];
        for (int i = 0; i < n; i++) {
            vec[i] = new Vectex();
        }
        cnt = new int[n];
        ans = new long[n];
        tmp = new long[n];

        for (int i = 0; i < n - 1; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            x--; y--;
            vec[x].adj.add(y);
            vec[y].adj.add(x);
        }
        fac[0] = 1;
        for (int i = 1; i <= n; i++) {
            fac[i] = fac[i - 1] * i % mod;
        }
        dfs(0, -1);
        dfs2(0, -1);
        for (int i = 0; i < n; i++) {
            out.println(ans[i]);
        }
    }

    private void dfs2(int u, int fu) {
        long t = 1;
        if (fu != -1) {
            t = ans[fu] * powMod(getC(n, cnt[u]), mod - 2) % mod * powMod(tmp[u], mod - 2) % mod;
        }
        ans[u] = getC(n, n - cnt[u] - 1) * tmp[u] * t;
        for (int v : vec[u].adj) {
            if (v != fu) {
                dfs2(v, u);
            }
        }
    }

    private void dfs(int u, int fu) {
        cnt[u] = 1;
        tmp[u] = 1;
        for (int v : vec[u].adj) {
            if (v != fu) {
                dfs(v, u);
                cnt[u] += cnt[v];
            }
        }
        int nn = cnt[u] - 1;
        for (int v : vec[u].adj) {
            if (v != fu) {
                tmp[u] = tmp[u] * getC(nn, cnt[v]) % mod;
                nn -= cnt[v];
            }
        }

    }

    class Vectex {
        List<Integer> adj;

        public Vectex() {
            this.adj = new ArrayList<>();
        }
    }


}



class InputReader {

    private final BufferedReader reader;
    private StringTokenizer tokenizer;

    public InputReader(InputStream stream) {
        reader = new BufferedReader(new InputStreamReader(stream));
        tokenizer = null;
    }

    public String nextLine() {
        try {
            return reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String next() {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(nextLine());
        }
        return tokenizer.nextToken();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }

}
