import java.io.*;
import java.util.*;

public class Main {
    static PrintWriter out = new PrintWriter(System.out);
    static Scanner sc = new Scanner(System.in);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    long mod = 1000000000+7;
    int[] id; // for UF
    int[] remain; // even in the "connected component", how many heavy edges remaining
    long[] tot_X;
    public static void main(String[] args) throws IOException {
        Main main = new Main();
//        main.solve();
        out.println(main.solve());
        out.flush();
    }
    long solve() throws IOException {
        int n = sc.nextInt(), m = sc.nextInt();
        id = new int[n];
        remain = new int[n];
        for(int i=0;i<n;i++) id[i] = i;
        Arrays.fill(remain,0);
        long[] X = new long[n];
        for(int i=0; i<n;i++) X[i] = sc.nextLong();
        tot_X = new long[n];
        for(int i=0; i<n;i++) tot_X[i] = X[i];
        PriorityQueue<Edge> pq = new PriorityQueue<>(m,Comparator.comparingLong(o1->o1.weight));
        for(int i=0; i<m;i++){
            int u = sc.nextInt()-1, v = sc.nextInt()-1;
            long y = sc.nextLong();
            pq.add(new Edge(u, v, y));
        }
        long ans = m;
        while(pq.size()>0){
            // lighter edges comes out first
            Edge e = pq.poll();
            int from = e.u, to = e.v;
            int i = find(from), j = find(to);
            if(i==j){
                if(tot_X[i]>=e.weight){
                    ans --;
                } else{
                    remain[i] += 1; // current component not heavy enough. needs further vertex
                }
            } else{
                // no harm to suppose that i and j are being connected, as long as we don't change the value of ans.
                // i.e., the edge now is still considered taken away. until further heavier edges contribute by
                // connecting more vertex. That time, the current e are automatically put back
                long left = tot_X[i], right = tot_X[j];
                if(left+right>=e.weight){
                    ans -= 1+remain[i]+remain[j];
                    remain[i] = 0; remain[j] = 0;
                } else{
                    remain[i] += 1+remain[j];
                }
                tot_X[i] += tot_X[j];
                id[j] = i;
            }
        }
        return ans;
    }
    int find(int p){
        while(p!=id[p]){
            id[p] = id[id[p]];
            p = id[p];
        }
        return p;
    }

    class Edge {
        int u, v;
        long weight;
        public Edge(int _u, int _v, long _w){
            u = _u; v = _v; weight = _w;
        }
    }
}