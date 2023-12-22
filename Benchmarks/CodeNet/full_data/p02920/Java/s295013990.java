import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    static final Scanner sc = new Scanner(System.in);
    static final int MOD = (int) 1E9 + 7;
    
    public static void main(String[] args) {
        int N = nint();
        int pow = (int) Math.pow(2, N);
        int[] S = nints(pow); 
        Arrays.sort(S);

        PriorityQueue<Node> d = new PriorityQueue<Node>(Node.comp);
        Deque<Node> deq = new ArrayDeque<>();
        Node start = new Node(-1, N, N, null);
        deq.add(start);
        d.add(start);
        
        while (!deq.isEmpty()) {
            Node f = deq.poll();
            for (int i = f.n-1; i >= 0; i--) {
                Node child = new Node(-1, i, f.getD()-1, f);
                d.add(child);
                deq.add(child);
            }
        }
        
        Node[] nodes = new Node[pow];
        int idx = 0;
        while (!d.isEmpty()) {
            Node node = d.poll();
            node.v = S[idx];
            nodes[idx] = node;
            idx++;
        }
        
        for (int i = 0; i < pow; i++) {
            Node node = nodes[i];
            if (node.parent != null) {
                if (node.parent.v <= node.v) {
                    System.out.println("No");
                    return;
                }
            }
        }
        
        System.out.println("Yes");
    }
    public static class Node {
        Node parent;
        int v;
        int n;
        int d;
        public int getN() {return n;}
        public int getD() {return d;}
        public int getV() {return v;}
        public Node(int v, int n, int d, Node parent) {
            super();
            this.v = v;
            this.n = n;
            this.d = d;
            this.parent = parent;
        }
        
        public static Comparator<Node> comp = Comparator.comparing(Node::getN).thenComparing(Node::getD);
        
        public String toString() {
            return "n = " + n + ", d = " + d + ", v = " + v;
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
