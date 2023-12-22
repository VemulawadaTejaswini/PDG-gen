import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

class Main {
    static final int MOD = 1000003;
    static final BigInteger BMOD = BigInteger.valueOf(MOD);
    static final int INF = 1 << 30;
    static final int ALF = 26;

    Main() {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int Q = sc.nextInt();

        BigInteger[] modfact = new BigInteger[MOD];
        modfact[0] = BigInteger.ONE;
        for (int i = 1; i < MOD; i++) {
            modfact[i] = modfact[i - 1].multiply(BigInteger.valueOf(i)).mod(BMOD);
        }

        for (int q = 0; q < Q; q++) {
            int x = sc.nextInt();
            int d = sc.nextInt();
            int n = sc.nextInt();
            BigInteger bx = BigInteger.valueOf(x);
            BigInteger bd = BigInteger.valueOf(d);
            BigInteger bn = BigInteger.valueOf(n);
            /*
             * d == 1 ans = (x+(n-1))P(n) = (x+(n-1))!/n! d > 1 ans = culc (d==1 and x/=d)
             * and later pow(d,n) (x/d + n-1)P(n) * pow(d,n)
             */
            if (d == 0) {
                pw.println(bx.modPow(bn, BMOD));
            } else {
                BigInteger blx = bx.multiply(bd.modInverse(BigInteger.valueOf(MOD))).mod(BMOD);
                BigInteger last = blx.add(bn).subtract(BigInteger.ONE).mod(BMOD);
                // System.err.println(blx);
                // System.err.println(last);
                if (last.compareTo(BMOD) >= 0) {
                    pw.println(0);
                } else {
                    if (blx.compareTo(BigInteger.ZERO) <= 0) {
                        BigInteger ans = modfact[last.intValueExact()].multiply(bd.modPow(bn, BMOD)).mod(BMOD);
                        pw.println(ans);
                    } else {
                        BigInteger perm = modfact[last.intValueExact()]
                                .multiply(modfact[blx.subtract(BigInteger.ONE).intValueExact()].modInverse(BMOD)).mod(BMOD);
                        // System.err.println(perm);
                        BigInteger ans = perm.multiply(bd.modPow(bn, BMOD)).mod(BMOD);
                        pw.println(ans);
                    }
                }
            }

        }
        pw.flush();
    }

    public static void main(String[] args) {
        new Main();
    }
}

class FastScanner {
    private BufferedReader reader = null;
    private StringTokenizer tokenizer = null;

    public FastScanner(InputStream in) {
        reader = new BufferedReader(new InputStreamReader(in));
        tokenizer = null;
    }

    public String next() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }

    public String nextLine() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                return reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        return tokenizer.nextToken("\n");
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }

    public ArrayList<Integer> nextIntList(int n) {
        ArrayList<Integer> a = new ArrayList<Integer>(n);
        for (int i = 0; i < n; i++)
            a.add(nextInt());
        return a;
    }

    public ArrayList<Long> nextLongList(int n) {
        ArrayList<Long> a = new ArrayList<Long>(n);
        for (int i = 0; i < n; i++)
            a.add(nextLong());
        return a;
    }

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