import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static final Scanner     sc = new Scanner(System.in);
    static final PrintStream so = System.out;
    
    public static void main(String[] args) {
        List<V> v = new ArrayList<>();
        long sumB = 0;
        
        int Q = ni();
        for (int i = 0; i < Q; i++) {
            int queryType = ni();
            
            if (queryType == 2) {
                so.println(calcMinXAndValue(v, sumB));
                
            } else {
                int a = ni();
                int b = ni();
                v.add(new V(a));
                sumB += b;
            }
        }
    }
    
    public static String calcMinXAndValue(List<V> vs, long b) {
        if (vs.isEmpty()) {
            return "0 0";
        }
        
        int minX = searchX(vs);
        long minValue = b + V.calcList(vs, minX);
        
        return minX + " " + minValue;
    }

    public static int searchX(List<V> vs) {
        int ok = (int) -1E9;
        int ng = (int) 1E9 + 1;
        
        while (Math.abs(ok - ng) > 1) {
            int mid = (ok + ng) / 2;
            if (!isOk(vs, mid)) {  // {1, 2, 3, [4], 5, 6, 7} toFind = 3, mid = 3
                ok = mid;
            } else {
                ng = mid;
            }
        }
        return ok;
    }
    
    public static boolean isOk(List<V> vs, int x) {
        return V.calcList(vs, x) <= V.calcList(vs, x+1) && V.calcList(vs, x) >= V.calcList(vs, x-1);
    }
    
    public static class V {
        int a;
        public V(int a) {
            this.a = a;
        }
        public int apply(int x) {
            return Math.abs(x - a);
        }
        
        static long calcList(List<V> vs, int x) {
            long ans = 0;
            for (V v: vs) {
                ans += v.apply(x);
            }
            return ans;
        }
    }
    
    private static int ni() {
        return sc.nextInt();
    }

    private static long nl() {
        return sc.nextLong();
    }

    private static String ns() {
        return sc.next();
    }

    private static char[] nsToChars() {
        return sc.next().toCharArray();
    }

    private static long[] nlongs(int n) {
        return nlongs(n, 0);
    }

    private static long[] nlongs(int n, int padding) {
        long[] a = new long[padding + n];
        for (int i = 0; i < n; i++)
            a[padding + i] = ni();
        return a;
    }
}
