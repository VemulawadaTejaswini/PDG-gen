import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    private static boolean debug = false;
    private static boolean elapsed = false;

    private static PrintWriter _out = new PrintWriter(System.out);
    private static PrintWriter _err = new PrintWriter(System.err);

    private void solve(Scanner sc) {
        int N = sc.nextInt();

        Map<Integer, List<Integer>> map = new HashMap<>();
        Set<Integer> black = new HashSet<>();
        Set<Integer> white = new HashSet<>();
        for (int i = 1; i <= N; ++i) {
            map.put(i, new ArrayList<>());
        }

        for (int i = 1; i <= N - 1; ++i) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            map.get(a).add(b);
            map.get(b).add(a);
        }
        black.add(1);
        white.add(N);

        int ct1 = 0;
        {
            Set<Integer> set1 = new HashSet<>(map.get(1));
            Set<Integer> set2 = new HashSet<>();
            while (!set2.containsAll(set1)) {
                set2.addAll(set1);
                Set<Integer> tmp = set1;
                set1 = new HashSet<>();
                for (Integer i : tmp) {
                    if (i != N) {
                        set1.addAll(map.get(i));
                    }
                }
            }
            ct1 = set2.size();
        }
        int ct2 = 0;
        {
            Set<Integer> set1 = new HashSet<>(map.get(N));
            Set<Integer> set2 = new HashSet<>();
            while (!set2.containsAll(set1)) {
                set2.addAll(set1);
                Set<Integer> tmp = set1;
                set1 = new HashSet<>();
                for (Integer i : tmp) {
                    if (i != 1) {
                        set1.addAll(map.get(i));
                    }
                }
            }
            ct2 = set2.size();
        }

        if (ct1 >= ct2) {
            _out.println("Fennec");
        } else {
            _out.println("Snuke");
        }
    }
    private static BigInteger C(long n, long r) {
        BigInteger res = BigInteger.ONE;
        for (long i = n; i > n - r; --i) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        for (long i = r; i > 1; --i) {
            res = res.divide(BigInteger.valueOf(i));
        }
        return res;
    }
    private static BigInteger P(long n, long r) {
        BigInteger res = BigInteger.ONE;
        for (long i = n; i > n - r; --i) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }
    /*
     * 10^10 > Integer.MAX_VALUE = 2147483647 > 10^9
     * 10^19 > Long.MAX_VALUE = 9223372036854775807L > 10^18
     */
    public static void main(String[] args) {
        long S = System.currentTimeMillis();

        Scanner sc = new Scanner(System.in);
        new Main().solve(sc);
        _out.flush();

        long G = System.currentTimeMillis();
        if (elapsed) {
            _err.println((G - S) + "ms");
        }
        _err.flush();
    }
}