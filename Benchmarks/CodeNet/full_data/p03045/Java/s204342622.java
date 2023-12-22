import java.io.PrintStream;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class Main {
    static final Scanner     sc = new Scanner(System.in);
    static final PrintStream so = System.out;
    
    public static void main(String[] args) throws InterruptedException {
        int n = ni();
        int m = ni();
        
        boolean[] visited = new boolean[n+1];
        Map<Integer, Set<Integer>> cost = new HashMap<>();
        Set<Integer> allN = new HashSet<>();
        
        for (int i = 1; i <= n; i++) {
            cost.put(i, new HashSet<>());
            allN.add(i);
        }
        
        for (int i = 0; i < m; i++) {
            int xm = ni();
            int ym = ni();
            int zm = ni();
            cost.get(xm).add(ym);
            cost.get(ym).add(xm);
        }
        
        int numGraph = 0;
        
        while (true) {
            int start = findStart(visited);
            
            if (start == -1) {
                break;
            }
            
            Deque<Integer> deque = new ArrayDeque<>();
            deque.addLast(start);
            while (!deque.isEmpty()) {
                Integer first = deque.pollFirst();
                visited[first] = true;
                Set<Integer> nexts = cost.get(first);
                for (Integer next : nexts) {
                    if (!visited[next]) {
                        deque.addLast(next);
                        visited[next] = true;
                    }
                }
            }
            numGraph++;
        }
        
        so.println(numGraph);
    }
    
    static int findStart(boolean[] visited) {
        for (int i = 1; i < visited.length; i++) {
            if (!visited[i]) {
                return i;
            }
        }
        return -1;
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
