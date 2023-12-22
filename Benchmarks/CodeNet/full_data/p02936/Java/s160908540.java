import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static final Scanner sc = new Scanner(System.in);
    static final int MOD = (int) 1E9 + 7;
    static final int NIL = -1;
    
    public static void main(String[] args) {
        int N = nint();
        int Q = nint();
        Map<Integer, List<Integer>> tree = new HashMap<>();
        
        for (int i = 1; i < N; i++) {
            int a = nint();
            int b = nint();
            put(tree, a, b);
            put(tree, b, a);
        }
        
        int[] sumX = new int[N+1];
        for (int i = 1; i <= Q; i++) {
            sumX[nint()] += nint();
        }
        
        boolean[] visited = new boolean[N+1];
        
        Deque<Integer> stack = new ArrayDeque<Integer>();
        stack.push(1);
        visited[1] = true;
        int[] ans = new int[N+1];
        ans[1] = sumX[1];
        
        while (!stack.isEmpty()) {
            Integer parent = stack.pop();
            
            List<Integer> children = tree.get(parent);
            
            for (int child : children) {
                if (visited[child]) continue;
                stack.push(child);
                ans[child] = ans[parent] + sumX[child];
                visited[child] = true;
            }
        }
        
        for (int i = 1; i <= N; i++) {
            System.out.print(ans[i] + " ");
        }
    }
    
    private static void put(Map<Integer, List<Integer>> tree, int a, int b) {
        if (!tree.containsKey(a)) {
            tree.put(a, new ArrayList<>());
        }
        
        List<Integer> children = tree.get(a);
        children.add(b);
        tree.put(a, children);
    }
    
    static class Node {
        Node parent;
        List<Node> children;
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

    private static char[] nsToChars() {
        return sc.next().toCharArray();
    }

    private static long[] nlongs(int n) {
        return nlongs(n, 0, 0);
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

    private static long[] nlongs(int n, int padL, int padR) {
        long[] a = new long[padL + n + padR];
        for (int i = 0; i < n; i++)
            a[padL + i] = nlong();
        return a;
    }

    private static String[] nstrs(int n) {
        String[] a = new String[n];
        for (int i = 0; i < n; i++)
            a[i] = nstr();
        return a;
    }

    private static char[][] nsToChars2D(int h, int w) {
        return nsToChars2D(h, w, 0);
    }

    private static char[][] nsToChars2D(int h, int w, int pad) {
        char[][] a2 = new char[h + pad * 2][w + pad * 2];
        for (int i = 0; i < h; i++)
            System.arraycopy(nsToChars(), 0, a2[pad + i], pad, w);
        return a2;
    }
}
