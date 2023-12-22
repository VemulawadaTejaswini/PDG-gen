import java.awt.*;
import java.lang.*;
import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;


public class Main {
    public void solve() throws IOException {
        int n = nextInt();
        int last = 0;
        int ans = 0;
        int a[] = new int[n + 2];
        for (int i = 1; i <= n; i++) {
            a[i] = nextInt();
        }
        for (int i = 1; i < n + 2; i++) {
            ans += Math.abs(last - a[i]);
            last = a[i];
        }
        last = 0;
        for (int i = 1; i <= n; i++) {
            out.println(ans - Math.abs(last - a[i]) - Math.abs(a[i] - a[i + 1]) + Math.abs(last - a[i + 1]));
            last = a[i];
        }
    }

    BufferedReader br;
    StringTokenizer sc;
    PrintWriter out;

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        new Main().run();
    }

    void run() throws IOException {
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
//            br = new BufferedReader(new FileReader("refrain.in"));
//            out = new PrintWriter(new File("refrain.out"));

            solve();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    String nextToken() throws IOException {
        while (sc == null || !sc.hasMoreTokens()) {
            try {
                sc = new StringTokenizer(br.readLine());
            } catch (Exception e) {
                return null;
            }
        }
        return sc.nextToken();
    }

    int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }

    long nextLong() throws IOException {
        return Long.parseLong(nextToken());
    }

    double nextDouble() throws IOException {
        return Double.parseDouble(nextToken());
    }
}