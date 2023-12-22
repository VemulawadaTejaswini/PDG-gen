
import java.util.Comparator;
import java.util.Scanner;

/* static int java.util.Arrays.binarySearch(int[] a, int key); */


public class Main {
    Scanner sc = new Scanner(System.in);
    int n, c;
    int[][] d;
    public void run(){
        n = sc.nextInt();
        c = sc.nextInt();
        d = new int[c][c];
        for(int i = 0; i < c; i++){
            for(int j = 0; j < c; j++){
                int cd = sc.nextInt();
                d[i][j] = cd;
            }
        }
        solve();
    }
    public void solve(){
        int memo[][] = new int[c][3];

        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                int nc = sc.nextInt() - 1;
                int nn = (i + j) % 3;
                for(int k = 0; k < c; k++){
                    memo[k][nn] += d[nc][k];
                }
            }
        }

        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < c; i++){
            for(int j = 0; j < c; j++){
                for(int k = 0; k < c; k++){
                    if(i != j && j != k && k != i){
                        int sum = memo[i][0] + memo[j][1] + memo[k][2];
                        if(ans > sum){
                            ans = sum;
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args){
        new Main().run();
    }

    static class Pair {
        int first,second;
        public Pair(int a,int b) {
            this.first = a;
            this.second = b;
        }
    }
    static class Edge{
        int to, cost;
        public Edge(int a, int b){
            this.to = a;
            this.cost = b;
        }
    }
    class MyComparator implements Comparator {
        @Override
        public int compare (Object arg0, Object arg1) {
            int x = ((Pair)arg0).first;
            int y = ((Pair)arg1).first;

            if (x < y) {
                return 1;
            } else if (x > y) {
                return -1;
            } else{
                return 0;
            }
        }
    }
    static class UnionFind{
        int par[];
        int rank[];

        //n要素で初期化
        public UnionFind(int maxn){
            par = new int[maxn];
            rank = new int[maxn];

            for(int i = 0; i < maxn; i++){
                par[i] = i;
                rank[i] = 0;
            }
        }

        //木の根を求める
        int find(int x){
            if(par[x] == x){
                return x;
            }
            else {
                return par[x] = find(par[x]);
            }
        }

        // xとyの属する集合を併合
        void unite (int x, int y){
            x = find(x);
            y = find(y);
            if(x == y){
                return;
            }

            if(rank[x] < rank[y]){
                par[x] = y;
            }
            else{
                par[y] = x;
                if(rank[x] == rank[y]) rank[x]++;
            }
        }

        // xとyが同じ集合に属するか否か
        boolean same(int x, int y){
            return find(x) == find(y);
        }
    }

}