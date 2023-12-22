import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    static final Scanner     sc = new Scanner(System.in);
    static final PrintStream so = System.out;
    
    public static void main(String[] args) {
        int N = ni();
        int K = ni();
        int maxK = (N-1)*(N-2)/2;
        if (K > maxK) {
            so.println("-1");
            return;
        }
        
        boolean[][] g = new boolean[N+1][N+1];
        for (int i = 1; i < N; i++) {
            g[i][N] = g[N][i] = true;
        }
        
        int edgeToAdd = maxK - K;
        
        loop: for (int i = 1; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                if (edgeToAdd <= 0) {
                    break loop;
                }
                g[i][j] = g[j][i] = true;
                edgeToAdd--;
            }
        }
        
        so.println(N*(N-1)/2 - K);
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (i > j && g[i][j]) {
                    so.println(i + " " + j);
                }
            }
        }
    }
    
    static class Task implements Comparable<Task>{
        public int cost;
        public int due;
        public Task(int cost, int due) {
            this.cost = cost;
            this.due = due;
        }
        @Override
        public int compareTo(Task that) {
            return this.due - that.due;
        }
        
        @Override
        public String toString() {
            return "cost: " + cost + ", due: " + due;
        }
    }
    
    
    static int gcd(int m, int n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }
    
    static long lcm(int m, int n) {
        return (long) m * (long) n / gcd(m, n);
    }

    private static long nl() {
        return sc.nextLong();
    }

    private static int ni() {
        return sc.nextInt();
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

    private static long[] nlongs(int n, int offset) {
        long[] a = new long[offset + n];
        for (int i = 0; i < n; i++)
            a[offset + i] = nl();
        return a;
    }
}
