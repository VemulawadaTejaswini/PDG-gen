import java.util.*;

public class Main {
    static ArrayList<ArrayList<Integer>> edge;
    static long[] dist_0;
    static long[] dist_N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        dist_0 = new long[N];
        dist_N = new long[N];
        Arrays.fill(dist_0, -1);
        Arrays.fill(dist_N, -1);
        edge = new ArrayList<ArrayList<Integer>>();
        for (int i=0;i<N;i++) {
            ArrayList<Integer> add = new ArrayList<Integer>();
            edge.add(add);
        }
        for (int i=0;i<N-1;i++) {
            int a = Integer.parseInt(sc.next())-1;
            int b = Integer.parseInt(sc.next())-1;
            edge.get(a).add(b);
            edge.get(b).add(a);
        }

        dfs(0, dist_0, 0);
        dfs(N-1, dist_N, 0);
        int Fennec = 0;
        int snuke = 0;
        for (int i=0;i<N;i++) {
            if (dist_0[i]<=dist_N[i]) {
                Fennec++;
            } else {
                snuke++;
            }
        }

        if (Fennec>snuke) {
            System.out.println("Fennec");
        } else {
            System.out.println("snuke");
        }
    }

    static void dfs(int s, long[] dist, int depth) {
        dist[s]=depth;
        for (Integer i :  edge.get(s)) {
            if (dist[i]!=-1) continue;
            dfs(i, dist, depth+1);
        }
    }
}
