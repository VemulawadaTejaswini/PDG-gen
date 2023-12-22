
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int nn = 1<<n;

        int[] d = new int[nn];
        Arrays.fill(d, Integer.MAX_VALUE);
        boolean[] v = new boolean[nn];

        ArrayList<K> keys = new ArrayList<>();
        for(int i=0; i<m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int mask = 0;
            for(int j=0; j<b; j++) {
                mask |= 1 << (sc.nextInt()-1);
            }
            keys.add(new K(a, mask));
        }
        Collections.sort(keys);

        int amask = 0;
        for(K k : keys) {
            amask |= k.mask;
        }
        if(amask != nn-1) {
            System.out.println(-1);
            return;
        }


        PriorityQueue<P> q = new PriorityQueue<>();
        q.add(new P(0, 0));
        d[0] = 0;
        while(!q.isEmpty()) {
            P p = q.poll();
            v[p.i] = true;
            for(K k : keys) {
                int next = p.i | k.mask;
                int nd = p.d + k.a;
                if(!v[next] && nd < d[next]) {
                    d[next] = nd;
                    q.add(new P(next, nd));
                }
            }
        }

        int res = d[nn-1];
        if(res == Integer.MAX_VALUE) {
            res = -1;
        }
        System.out.println(res);
    }

    static class P implements Comparable<P> {
        int i;
        int d;
        public P(int i, int d) {
            this.i = i;
            this.d = d;
        }
        @Override public int compareTo(P o) {
            return d - o.d;
        }
    }

    static class K implements Comparable<K>{
        int a;
        int mask;
        public K(int a, int mask) {
            this.a = a;
            this.mask = mask;
        }

        @Override public int compareTo(K o) {
            return a - o.a;
        }
    }

}


