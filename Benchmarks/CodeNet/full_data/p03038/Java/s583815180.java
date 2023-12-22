import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.LongStream;

public class Main {
    static final Scanner     sc = new Scanner(System.in);
    static final PrintStream so = System.out;
    
    public static void main(String[] args) {
        int n = ni();
        int m = ni();
        long[] a = nlongs(n);
        long[] b = new long[m];
        long[] c = new long[m];
        Operation[] opes = new Operation[m];
        
        for (int i = 0; i < m; i++) {
            b[i] = ni();
            c[i] = ni();
            opes[i] = new Operation(b[i], c[i]);
        }
        Arrays.sort(opes);
        Arrays.sort(a);
        
        int idxOpe = m-1;
        for (int i = 0; i < n; i++) {
            
            long opeC = opes[idxOpe].c;
            if (a[i] >= opeC) {
                break;
            }
            a[i] = opeC;
            opes[idxOpe].b--;
            
            if (opes[idxOpe].b == 0) {
                idxOpe--;
            }
            
            if (idxOpe == -1) {
                break;
            }
        }
        
        so.println(LongStream.of(a).sum());
    }
    
    public static class Operation implements Comparable<Operation> {
        public long b;
        public long c;
        public Operation(long b, long c) {
            this.b = b;
            this.c = c;
        }
        @Override
        public int compareTo(Operation that) {
            return (int) (this.c - that.c);
        }
        @Override
        public String toString() {
            return "Ope[b: " + b + ", c: " + c + "]";
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
