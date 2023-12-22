import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = sc.nextInt();

        int[][] m = new int[C][100_000+1];

        for (int i = 0; i < N; i++) {
            int s = sc.nextInt();
            int t = sc.nextInt();
            int c = sc.nextInt();
            m[c-1][s]++;
            m[c-1][t]--;
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->a.t != b.t ? a.t-b.t : a.s-b.s);
        for (int i = 0; i < C; i++) {
            int ss = 0;
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == 1) ss = j;
                if (m[i][j] == -1) pq.offer(new Pair(ss,j));
            }
        }

        PriorityQueue<Pair> pq2 = new PriorityQueue<>((a,b)->a.t != b.t ? a.t-b.t : a.s-b.s);
        pq2.offer(pq.poll());
        int ans = 1;
        while (!pq.isEmpty()) {
            Pair p = pq.poll();
            Pair p2 = pq2.peek();
            if (p2.t < p.s) {
                pq2.poll();
            } else {
                ans++;
            } 
            pq2.offer(p);
        }

        System.out.println(ans);
    }

    private static class Pair {
        private final int s;
        private final int t;
        Pair(int s, int t) {
            this.s = s;
            this.t = t;
        }
    }
}
