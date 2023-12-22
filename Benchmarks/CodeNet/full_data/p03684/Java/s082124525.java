import java.util.*;


/**
 * Created by takaesumizuki on 2017/06/14.
 */
public class Main {

    void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int zahyouX[] = new int[N];
        int zahyouY[] = new int[N];
        int cost[][] = new int[N][N];
        for (int i = 0; i < N; i++) {
            zahyouX[i] = sc.nextInt();
            zahyouY[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int tmpCost = Math.min(Math.abs(zahyouX[i] - zahyouX[j]), Math.abs(zahyouY[i] - zahyouY[j]));
                cost[i][j] = tmpCost;
                cost[j][i] = tmpCost;
            }
        }

        Prim minTree = new Prim(N,cost);
        int ans = minTree.prim();
        System.out.println(ans);
    }

    public static void main(String[] args) {
        new Main().run();
    }


}


class Prim {
    int V;//頂点数
    int cost[][];
    int mincost[];
    boolean used[];
    int INF = Integer.MAX_VALUE - 10;

    Prim(int v, int[][] cost) {
        this.V = v;
        this.cost = new int[v][v];
        this.mincost = new int[v];
        this.used = new boolean[v];
        this.setCost(cost);
    }

    void setCost(int[][] cost) {
        for (int i = 0; i < cost.length; i++) {
            for (int j = 0; j < cost[i].length; j++) {
                this.cost[i][j] = cost[i][j];
            }
        }
    }


    int prim() {
        for (int i = 0; i < V; ++i) {
            mincost[i] = INF;
            used[i] = false;
        }
        mincost[0] = 0;
        int res = 0;

        while (true) {
            int v = -1;
            for (int u = 0; u < V; u++) {
                if (!used[u] && (v == -1 || mincost[u] < mincost[v])) v = u;
            }

            if (v == -1) break;
            used[v] = true;
            res += mincost[v];

            for (int u = 0; u < V; u++) {
                mincost[u] = Math.min(mincost[u], cost[v][u]);
            }
        }
        return res;
    }
}
