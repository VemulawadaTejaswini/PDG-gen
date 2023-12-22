import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        DJSet dj = new DJSet(n);
        int[][] e = new int[m][3];
        for (int i = 0; i < m; i++) {
            int l = sc.nextInt()-1;
            int r = sc.nextInt()-1;
            int d = sc.nextInt();
            e[i][0] = l; e[i][1] = r; e[i][2] = d;
            dj.union(l, r);
        }
        int[][][] g = buildWeightedGraph(n, e);
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int r = dj.root(i);
            if(r < 0){
                if(dj.countElement(r) == 1) continue;
                r = i;
            }
            set.add(r);
        }
        int[] p = new int[n];
        boolean[] used = new boolean[n];
        boolean ans = true;
        for(int r : set){
            ArrayDeque<Integer> q = new ArrayDeque<>();
            q.add(r);
            used[r] = true;
            while(!q.isEmpty()){
                int v = q.poll();
                used[v] = true;
                for(int[] na : g[v]){
                    int nv = na[0], nd = na[1];
                    if(used[nv]){
                        if(p[nv] != p[v] + nd){
                            ans = false;
                            break;
                        }
                    }else{
                        p[nv] = p[v] + nd;
                        q.add(nv);
                    }
                }
                if(!ans)break;
            }
            if(!ans)break;
        }
        System.out.println(ans ? "Yes" : "No");
        sc.close();

    }

    public static int[][][] buildWeightedGraph(int n, int[][] edges){
        int m = edges.length;
        int[][][] graph = new int[n][][];
        int[] deg = new int[n];
        for (int i = 0; i < m; i++) {
            deg[ edges[i][0] ]++;
        }
        for (int i = 0; i < n; i++) {
            graph[i] = new int[deg[i]][2];
        }
        for (int i = 0; i < m; i++) {
            int a = edges[i][0];
            int b = edges[i][1];
            int c = edges[i][2];
            graph[a][--deg[a]][0] = b;
            graph[a][deg[a]][1] = c;
        }

        return graph;
    }

}

class DJSet {
    /**
     * 各要素の親を保持する配列。
     * 自信が根である要素は負の数を持つ。
     * （負の数の場合、絶対値がその集合の要素数）
     */
    public int[] upper;

    /**
     * コンストラクタ。
     * @param n 対象となる要素数
     */
    public DJSet(int n) {
        upper = new int[n];
        Arrays.fill(upper, -1);
    }

    /**
     * 要素xが含まれる集合のrootを求める。
     * rootを求める過程で経路圧縮しrootが親になるようにする。
     * @param x 要素x
     * @return 要素xが含まれる集合のroot
     */
    public int root(int x) {
        return upper[x] < 0 ? x : (upper[x] = root(upper[x]));
    }

    /**
     * 要素xと要素yが同じ集合か判定する。
     * @param x 要素x
     * @param y 要素y
     * @return 要素xと要素yが同じ集合であればtrue、そうでなければfalseを返す。
     */
    public boolean same(int x, int y) {
        return root(x) == root(y);
    }

    /**
     * 要素xと要素yを含むそれぞれの集合を合併する。
     * 要素数の多い集合のrootを残し、少ないほうのrootをその下に合併する。
     * @param x 要素x
     * @param y 要素y
     * @return 要素xと要素yを含むそれぞれの集合を合併できたらtrue、もともと同じ集合で合併しなかったらfalseを返す。
     */
    public boolean union(int x, int y) {
        x = root(x);
        y = root(y);
        if (x != y) {
            if (upper[y] < upper[x]) {
                int t = x;
                x = y;
                y = t;
            }
            upper[x] += upper[y];
            upper[y] = x;
        }
        return x != y;
    }

    /**
     * 集合の数を数える。
     * @return 集合の数
     */
    public int countSet() {
        int c = 0;
        for (int u : upper) {
            if (u < 0)
                c++;
        }
        return c;
    }

    /**
     * 要素ｘが含まれる集合の要素数を数える。
     * @param x 要素ｘ
     * @return 要素ｘが含まれる集合の要素数
     */
    public int countElement(int x) {
        return upper[root(x)] * -1;
    }
}