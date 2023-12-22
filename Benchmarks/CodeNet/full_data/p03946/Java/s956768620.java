
import static java.util.Comparator.naturalOrder;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static final Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int N = nint();
        int T = nint();
        int[] A = nints(N);
        
        int min = Integer.MAX_VALUE;
        int[] profit = new int[N];
        
        for (int i = 0; i < N; i++) {
            min = Math.min(min, A[i]);
            profit[i] = A[i] - min;
        }
        
        Map<Integer, Long> map = Arrays.stream(profit).boxed().collect(groupingBy(i -> i, counting()));
        map.remove(0);
        System.out.println(map.values().stream().max(naturalOrder()).get());
    }
    
    private static long nlong() {
        return sc.nextLong();
    }

    private static int nint() {
        return sc.nextInt();
    }

    private static String nstr() {
        return sc.next();
    }

    private static char[] nchars() {
        return sc.next().toCharArray();
    }

    private static String[] nstrs(int n) {
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = nstr();
        }
        return a;
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

    private static char[][] nchars2(int h, int w) {
        return nchars2(h, w, 0);
    }

    private static char[][] nchars2(int h, int w, int pad) {
        char[][] a2 = new char[h + pad * 2][w + pad * 2];
        for (int i = 0; i < h; i++)
            System.arraycopy(nchars(), 0, a2[pad + i], pad, w);
        return a2;
    }
}