import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class Main {
    BufferedReader br;
    PrintWriter out;
    StringTokenizer stok;

    String nextToken() throws IOException {
        while (stok == null || !stok.hasMoreTokens()) {
            String s = br.readLine();
            if (s == null) {
                return null;
            }
            stok = new StringTokenizer(s);
        }
        return stok.nextToken();
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

    char nextChar() throws IOException {
        return (char) (br.read());
    }

    String nextLine() throws IOException {
        return br.readLine();
    }

    int get(String s){
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            ans += s.charAt(i) - '0';
        }
        return ans;
    }

    void solve() throws IOException {
        int n = nextInt();
        BigInteger k = new BigInteger("0");
        BigInteger nn = new BigInteger(Integer.toString(n));
        int min = Integer.MAX_VALUE;

        long cur = System.currentTimeMillis();
        while (System.currentTimeMillis() - cur < 1900) {
            k = k.add(nn);
            min = Math.min(min, get(k.toString()));
        }
        out.println(min);
    }

    void run() throws IOException {
        // br = new BufferedReader(new FileReader("dragons.in"));
        //out = new PrintWriter("dragons.out");
        // br = new BufferedReader(new FileReader("input.txt"));
        // out = new PrintWriter("output.txt");
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        solve();
        br.close();
        out.close();
    }

    public static void main(String[] args) throws IOException {
        // Locale.setDefault(Locale.US);
        new Main().run();
    }
}