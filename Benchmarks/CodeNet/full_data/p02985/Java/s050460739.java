
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static final Scanner sc = new Scanner(System.in);
    static final int MOD = (int) 1E9 + 7;
    
    public static void main(String[] args) {
        int N = nint();
        int K = nint();
        int[] a = new int[N-1];
        int[] b = new int[N-1];
        for (int i = 0; i < N-1; i++) {
            a[i] = nint();
            b[i] = nint();
        }
        Map<Integer, Set<Integer>> tree = tree(a, b);
        
        boolean[] visited = new boolean[N+1];
        long ans = 0;
        Deque<Integer> d = new ArrayDeque<>();
        d.add(1);
        visited[1] = true;
        ans += K;
        
        while (!d.isEmpty()) {
            Integer f = d.pop();
            Set<Integer> children = tree.get(f);
            int numChild = 0;
            for (int child: children) {
                if (!visited[child]) {
                    numChild++;
                    d.add(child);
                    visited[child] = true;
                }
            }
            
            int pattern = f == 1 ? K-1 : K-2;
            if (numChild > pattern) {
                System.out.println(0);
                return;
            }
            ans *= calc(pattern, numChild);
            ans %= MOD;
        }
        
        System.out.println(ans);
    }
    
    public static long calc(int pattern, int numChild) {
        long prod = 1;
        for (int i = pattern; i > pattern - numChild; i--) {
            prod *= i;
            prod %= MOD;
        }
        return prod;
    }
    
    public static Map<Integer, Set<Integer>> tree(int[] nodes1, int[] nodes2) {
        Map<Integer, Set<Integer>> tree = new HashMap<>();
        
        for (int i = 0; i < nodes1.length; i++) {
            int u = nodes1[i];
            int v = nodes2[i];
            
            Set<Integer> uc = tree.get(u);
            if (uc == null) {
                uc = new HashSet<>();
            }
            uc.add(v);
            tree.put(u, uc);
            
            Set<Integer> vc = tree.get(v);
            if (vc == null) {
                vc = new HashSet<>();
            }
            vc.add(u);
            tree.put(v, vc);
        }
        return tree;
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
