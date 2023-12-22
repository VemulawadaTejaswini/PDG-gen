import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

class Main {

    static final int MOD = 1000000007;
    static final int INF = 1 << 30;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        int N = sc.nextInt();
        BigInteger M = new BigInteger(sc.next());
        String[] A = sc.nextStringArray(N);
        BigInteger halflcm = BigInteger.ONE;
        BigInteger lcm = BigInteger.ONE;
        for (int i = 0; i < N; i++) {
            BigInteger num = new BigInteger(A[i]);
            halflcm = lcm(halflcm, num.divide(BigInteger.ONE.add(BigInteger.ONE)));
            lcm = lcm(lcm, num);
            // X = Math.max(0,Math.min(X,M-num/2));
            // System.err.println(lcm);
            // System.err.println(halflcm);
            if(lcm.compareTo(M)>0){
                System.out.println(0);
                return;
            }
        }
        System.out.println(M.add(halflcm).divide(lcm));
    }

    static BigInteger gcd(BigInteger m, BigInteger n) {
        if (n.compareTo(m)>0)
            return gcd(n, m);
        if (n.equals(BigInteger.ZERO))
            return m;
        return gcd(n, m.mod(n));
    }

    static BigInteger lcm(BigInteger m, BigInteger n) {
        return m.multiply(n).divide(gcd(m, n));
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

    public String[] nextStringArray(int n) {
        String[] a = new String[n];
        for (int i = 0; i < n; i++)
            a[i] = next();
        return a;
    }
}