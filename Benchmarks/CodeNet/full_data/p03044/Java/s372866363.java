import java.io.PrintStream;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
    static final Scanner     sc = new Scanner(System.in);
    static final PrintStream so = System.out;

    static final int WHITE = 0;
    static final int BLACK = 1;
    static final int INF = Integer.MAX_VALUE;
    
    public static void main(String[] args) throws InterruptedException {
        int n = ni();
        int[] color = new int[n+1];
        boolean[] visited = new boolean[n+1];
        Map<Integer, Map<Integer, Integer>> cost = new HashMap<>();
        
        for (int i = 0; i <= n; i++) {
            cost.put(i, new HashMap<>());
        }
        
        
        for (int i = 0; i < n-1; i++) {
            int ui = ni();
            int vi = ni();
            int wi = ni();
            cost.get(ui).put(vi, wi);
            cost.get(vi).put(ui, wi);
        }
        
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addLast(1);
        color[1] = WHITE;
        
        while (!deque.isEmpty()) {
            Integer first = deque.pollFirst();
            visited[first] = true;
            Map<Integer, Integer> costFromFirst = cost.get(first);
            
            for (Integer next : costFromFirst.keySet()) {
                if (!visited[next]) {
                    deque.addLast(next);
                    color[next] = costFromFirst.get(next) % 2 == 0 ? color[first] : changeColor(color[first]);
                    visited[next] = true;
                }
            }
        }
        
        for (int i = 1; i <= n; i++) {
            so.println(color[i]);
        }
    }
    
    static int changeColor(int color) {
        return color == BLACK ? WHITE : BLACK;
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

    private static int[] nints(int n) {
        return nints(n, 0);
    }

    private static int[] nints(int n, int padding) {
        int[] a = new int[padding + n];
        for (int i = 0; i < n; i++)
            a[padding + i] = ni();
        return a;
    }
}
