import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;
import java.util.StringTokenizer;

public class Main {
    long mod = 1000000000 + 7;

    long binpow(long a, long n) {
        if (n == 0)
            return 1;
        if (n % 2 == 1)
            return (binpow(a, n - 1) * a) % mod;
        else {
            long b = binpow(a, n / 2);
            return (b * b) % mod;
        }
    }

    public void solve() throws IOException {
        int n = nextInt(), k = nextInt();
        int a[] = new int[n];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            a[i] = nextInt();
            if (a[i] == 1) cnt = i;
        }
        int res = (n - 1 + k - 2) / (k - 1);
        out.print(res);
    }

    BufferedReader br;
    StringTokenizer sc;
    PrintWriter out;

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        new Main().run();
    }

    public void run() throws IOException {
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
            solve();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public String nextToken() throws IOException {
        while (sc == null || !sc.hasMoreTokens()) {
            try {
                sc = new StringTokenizer(br.readLine());
            } catch (Exception e) {
                return null;
            }
        }
        return sc.nextToken();
    }

    public int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }

    public double nextDouble() throws IOException {
        return Double.parseDouble(nextToken());
    }

    public long nextLong() throws IOException {
        return Long.parseLong(nextToken());
    }
}
