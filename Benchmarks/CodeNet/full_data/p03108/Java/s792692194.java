import java.util.*;
public class Main {
    static int[] parents;
    static int[] sizes;
    static int n;
    static int m;
    
    private static long nC2(int x) {
        long numera = 1;
        for (int i = x; i > x - 2; i--) {
            numera *= i;
        }
        return numera / 2;
    }
    
    private static long union(int a, int b) {
        int ap = getParent(a);
        int bp = getParent(b);
        long ret = nC2(sizes[ap]) + nC2(sizes[bp]);
        if (ap == a && bp == b && sizes[ap] == 1 && sizes[bp] == 1) {
            parents[b] = a;
            sizes[a] += 1;
            return -1;
        }
        if (ap == bp) return 0;
        if (sizes[ap] >= sizes[bp]) {
            
            parents[bp] = ap;
            sizes[ap] += sizes[bp];
            ret -= nC2(sizes[ap]);
        } else {
            parents[ap] = bp;
            sizes[bp] += sizes[ap];
            ret -= nC2(sizes[bp]);
        }
        return ret;
    }

    private static int getParent(int x) {
        while (parents[x] != 0) {
            x = parents[x];
        }
        return x;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        parents = new int[n+1];
        sizes = new int[n+1];
        for (int i = 0; i < n+1; i++) sizes[i] = 1;
        long inconvenience = nC2(n);
        long[] inconveniences = new long[m];
        int[][] edges = new int[m][2];
        int a, b;
        for (int i = 0; i < m; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            edges[i][0] = a;
            edges[i][1] = b;
        }
        for (int i = m - 1; i >= 0; i--) {
            a = edges[i][0];
            b = edges[i][1];
            inconveniences[i] = inconvenience;
            inconvenience += union(a, b);
        }

        for (int i = 0; i < m; i++) {
            System.out.println(inconveniences[i]);
        }
    }
}