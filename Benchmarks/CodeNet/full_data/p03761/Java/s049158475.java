import java.io.*;
import java.math.*;
import java.util.*;
 
public class Main {
    private static boolean debug = false;
    private static boolean elapsed = false;
 
    private static PrintWriter _out = new PrintWriter(System.out);
    private static PrintWriter _err = new PrintWriter(System.err);
 
    private void solve(Scanner sc) {
        int n = sc.nextInt();
        sc.nextLine();
        List<List<Character>> S = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            List<Character> l = new ArrayList<>();
            String s = sc.nextLine();
            for (int j = 0; j < s.length(); ++j) {
                l.add(s.charAt(j));
            }
            Collections.sort(l);
            S.add(l);
        }
        int minLen;
        List<Character> ans = new ArrayList<>();
        do {
            minLen = Integer.MAX_VALUE;
            for (int i = 0; i < n; ++i) {
                minLen = Math.min(minLen, S.get(i).size());
            }
 
            if (minLen > 0) {
                int minCh = S.get(0).get(0);
                for (int i = 1; i < n; ++i) {
                    minCh = Math.min(minCh, S.get(i).get(0));
                }
                boolean ok = true;
                for (int i = 0; i < n; ++i) {
                    if (S.get(i).get(0) != minCh) {
                        ok = false;
                        break;
                    }
                }
                if (ok) {
                    ans.add((char)minCh);
                }
                for (int i = 0; i < n; ++i) {
                    if (S.get(i).get(0) == minCh) {
                        S.get(i).remove(0);
                    }
                }
            }
        } while (minLen > 0);
        Collections.sort(ans);
        for (char ch : ans) {
            _out.print(ch);
        }
        _out.println();
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