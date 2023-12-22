
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.IntStream;

public class Main {
    static final Scanner sc  = new Scanner(System.in);
    static final int     MOD = (int) 1E9 + 7;
    
    public static void main(String[] args) {
        int N = nint();
        Map<Integer, Set<Integer>> g = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            g.put(i, new HashSet<>());
        }
        
        for (int i = 1; i <= N; i++) {
            String s = nstr();
            for (int j = i + 1; j <= N; j++) {
                if (s.charAt(j-1) == '1') {
                    Set<Integer> set =  g.get(i);
                    set.add(j);
                    g.put(i, set);
                    
                    Set<Integer> set2 =  g.get(j);
                    set2.add(i);
                    g.put(j, set2);
                }
            }
        }
        if (hasOddCycle(g, N)) {
            System.out.println(-1);
            return;
        }
        
        System.out.println(calcDiameter(g, N) + 1);
    }
    
    private static int calcDiameter(Map<Integer, Set<Integer>> map, int size) {
        int[] distance = new int[size + 1];
        Arrays.fill(distance, -1);
        
        // 始点を決める
        Deque<Integer> d = new ArrayDeque<>();
        d.add(1);
        distance[1] = 0;
        
        while(!d.isEmpty()) {
            int cur = d.poll();
            Set<Integer> next = map.get(cur);
            for (int n : next) {
                
                if (distance[n] == -1) {
                    d.add(n);
                    distance[n] = distance[cur] + 1;
                }
            }
        }
        int maxDistanceFrom1 = IntStream.of(distance).max().getAsInt();
        int from = IntStream.range(1, size + 1)
                                .filter(i -> distance[i] == maxDistanceFrom1)
                                .findFirst()
                                .getAsInt();
        
        // 直径を求める
        Arrays.fill(distance, -1);
        d.add(from);
        distance[from] = 0;
        
        while(!d.isEmpty()) {
            int cur = d.poll();
            Set<Integer> next = map.get(cur);
            for (int n : next) {
                
                if (distance[n] == -1) {
                    d.add(n);
                    distance[n] = distance[cur] + 1;
                }
            }
        }
        return IntStream.of(distance).max().getAsInt();
    }
    
    private static boolean hasOddCycle(Map<Integer, Set<Integer>> map, int size) {
        int[] color = new int[size + 1];
        final int BLACK = 1;
        final int WHITE = 0;
        final int UNDEFINED = -1;
        Arrays.fill(color, UNDEFINED);
        
        
        Deque<Integer> d = new ArrayDeque<>();
        d.add(1);
        color[1] = BLACK;
        
        while(!d.isEmpty()) {
            int cur = d.poll();
            Set<Integer> next = map.get(cur);
            for (int n : next) {
                int nextColor = (color[cur] + 1) % 2;
                
                if (color[n] == UNDEFINED) {
                    color[n] = nextColor;
                    d.add(n);
                    
                } else if (color[n] != nextColor) {
                    return true;
                    
                } else {
                    // do nothing
                }
            }
        }
        return false;
    }
    
    
    private static int nint() {
        return sc.nextInt();
    }

    private static int[] nints(int n) {
        return nints(n, 0, 0);
    }

    private static int[] nints(int n, int padL, int padR) {
        int[] a = new int[padL + n + padR];
        for (int i = 0; i < n; i++)
            a[padL + i] = nint();
        return a;
    }

    private static long nlong() {
        return sc.nextLong();
    }

    private static long[] nlongs(int n) {
        return nlongs(n, 0, 0);
    }

    private static long[] nlongs(int n, int padL, int padR) {
        long[] a = new long[padL + n + padR];
        for (int i = 0; i < n; i++)
            a[padL + i] = nlong();
        return a;
    }

    private static double ndouble() {
        return sc.nextDouble();
    }

    private static double[] ndoubles(int n) {
        return ndoubles(n, 0, 0);
    }

    private static double[] ndoubles(int n, int padL, int padR) {
        double[] d = new double[n + padL + padR];
        for (int i = 0; i < n; i++) {
            d[padL + i] = ndouble();
        }
        return d;
    }

    private static String nstr() {
        return sc.next();
    }

    private static char[] nchars() {
        return sc.next().toCharArray();
    }

    private static char[] nchars(int padL, int padR) {
        char[] temp = sc.next().toCharArray();
        char[] ret = new char[temp.length + padL + padR];
        System.arraycopy(temp, 0, ret, padL, temp.length);
        return ret;
    }

    private static char[][] nchars2(int h, int w) {
        return nchars2(h, w, 0, 0);
    }

    private static char[][] nchars2(int h, int w, int padLU, int padRD) {
        char[][] a2 = new char[h + padLU + padRD][w + padLU + padRD];
        for (int i = 0; i < h; i++)
            System.arraycopy(nchars(), 0, a2[padLU + i], padLU, w);
        return a2;
    }

    private static long min(long... ls) {
        return Arrays.stream(ls).min().getAsLong();
    }

    private static int min(int... is) {
        return Arrays.stream(is).min().getAsInt();
    }

    private static long max(long... ls) {
        return Arrays.stream(ls).max().getAsLong();
    }

    private static int max(int... is) {
        return Arrays.stream(is).max().getAsInt();
    }

    private static long abs(long a, long b) {
        return Math.abs(a - b);
    }
}
