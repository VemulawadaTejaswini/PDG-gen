import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.io.PrintWriter;

import java.util.HashMap;
import java.util.Map.Entry;

@SuppressWarnings("unchecked")
public class Main {
    static final int INF = 1000000007;

    // 素因数分解
    static void primeFactor(HashMap<Integer, Integer> pf, int n) {
        int a = 2;

        // JDK 1.8 Map.merge
        // map value increment
        while (a * a <= n) {
            if (n % a == 0) {
                pf.merge(a, 1, Integer::sum);
                n = n / a;
            } else {
                a++;
            }
        }
        pf.merge(n, 1, Integer::sum);
    }

    // aとbを足した値をmodする(a + b mod p)
    static int modadd(int a, int b) {
        return (a + b) % INF;
    }

    // aとbを掛けた値をmodする(a * b mod p)
    static int modmulti(int a, int b) {
        int res = 0;
        int mod = a % INF;
        while (b > 0) {
            if ((b & 1) == 1) {
                res += mod;
                if (res > INF) {
                    res -= INF;
                }
            }
            mod <<= 1;
            if (mod > INF) {
                mod -= INF;
            }
            b >>= 1;
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        final String s;

        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            s = reader.readLine();
        }

        PrintWriter out = new PrintWriter(System.out);

        int N = Integer.parseInt(s);

        HashMap<Integer, Integer> pf = new HashMap<>();

        // 素因数分解 x = p^n * q^m * …
        // 1 は 素数ではない
        for (int i = 2; i <= N; i++) primeFactor(pf, i);

        // N 1 ならば 答えは 1
        int ans = 1;

        // 約数の個数 (n + 1) * (m + 1) * …
        for (Entry<Integer, Integer> en : pf.entrySet()) {
            int val = en.getValue();
            val = modadd(val, 1);
            ans = modmulti(ans, val);
        }

        out.println(ans);

        out.flush();
    }
}
