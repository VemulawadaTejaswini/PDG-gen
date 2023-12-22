import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
    
    static int N;
    static int M;
    static int L;
    static int[][] cost;
    static int[][] LINK;
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String[] strings;
        strings = in.readLine().split(" ");
        
        N = Integer.parseInt(strings[0]);
        M = Integer.parseInt(strings[1]);
        L = Integer.parseInt(strings[2]);
        
        cost = new int[N][N];
        List<List<Integer>> link = new ArrayList<>();
        for (int i = 0; i < N; ++i) {
            link.add(new ArrayList<>());
        }
        
        for (int i = 0; i < M; ++i) {
            strings = in.readLine().split(" ");
            int A = Integer.parseInt(strings[0])-1;
            int B = Integer.parseInt(strings[1])-1;
            int C = Integer.parseInt(strings[2]);
            if (C > L) continue;
            
            cost[A][B] = C;
            cost[B][A] = C;
            link.get(A).add(B);
            link.get(B).add(A);
        }
        
        LINK = new int[N][];
        for (int i = 0; i < N; ++i) {
            List<Integer> list = link.get(i);
            int[] array = new int[list.size()];
            for (int j = 0; j < array.length; ++j) {
                array[j] = list.get(j).intValue();
            }
            LINK[i] = array;
        }
        
        int Q = Integer.parseInt(in.readLine());
        for (int i = 0; i < Q; ++i) {
            strings = in.readLine().split(" ");
            int s = Integer.parseInt(strings[0])-1;
            int t = Integer.parseInt(strings[1])-1;
            int c = search(s, t);
            System.out.println(c);
        }
    }
    
    static class E {
        int e;
        int c;
        int f;
        int n;
        public E(int e, int c, int f, int n) {
            this.e = e;
            this.c = c;
            this.f = f;
            this.n = n;
        }
    }
    
    public static int search(int s, int t) {
        Comparator<E> comp = Comparator.comparingInt(e -> e.e);
        PriorityQueue<E> h = new PriorityQueue<>(comp);
        h.add(new E(0, 0, L, s));
        
        BitSet closed = new BitSet();
        while (!h.isEmpty()) {
            E e = h.poll();
            
            closed.set(e.n);
            
            if (e.n == t) {
                return e.c;
            }
            int[] link = LINK[e.n];
            for (int i = 0; i < link.length; ++i) {
                int n2 = link[i];
                if (closed.get(n2)) {
                    continue;
                }
                
                int f2 = e.f;
                int c2 = e.c;
                int cst = cost[e.n][n2];
                if (cst < 0) {
                    throw new IllegalStateException();
                }
                if (f2 < cst) {
                    if (f2 == L) {
                        continue;
                    }
                    f2 = L;
                    c2 += 1;
                }
                if (f2 >= cst) {
                    f2 -= cst;
                } else {
                    f2 = L;
                    c2 += 1;
                }
                h.add(new E(c2 * L + (L - f2 / 2), c2, f2, n2));
            }
        }
        return -1;
    }
}
