import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    static final Scanner sc = new Scanner(System.in);
    static final int MOD = (int) 1E9 + 7;
    
    public static void main(String[] args) {
        int N = nint();
        int pow = (int) Math.pow(2, N);
        int[] S_ = nints(pow); 
        Arrays.sort(S_);
        
        int[] S = new int[pow];
        for (int i = 0; i < pow; i++) {
            S[i] = S_[pow-i-1];
        }
        
        Deque<Node> d = new ArrayDeque<>();
        int idx = 0;
        d.add(new Node(S[0], N));
        idx++;
        
        while (!d.isEmpty()) {
            Node f = d.poll();
            
            for (int i = f.n-1; i >= 0; i--) {
                if (S[idx] >= f.v) {
                    System.out.println("No");
                    return;
                }
                Node child = new Node(S[idx], i);
                idx++;
                d.add(child);
            }
        }
        
        System.out.println("Yes");
    }
    public static class Node {
        int v;
        int n;
        public Node(int v, int n) {
            super();
            this.v = v;
            this.n = n;
        }
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
