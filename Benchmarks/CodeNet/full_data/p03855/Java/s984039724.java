import java.util.Arrays;
import java.util.Scanner;

public class ABC049D_ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int L = sc.nextInt();
        DJSet road = new DJSet(N+1);
        DJSet rail = new DJSet(N+1);
        for (int i = 0; i < K; i++) {
            int p = sc.nextInt();
            int q = sc.nextInt();
            road.union(p, q);
        }
        for (int i = 0; i < L; i++) {
            int r = sc.nextInt();
            int s = sc.nextInt();
            rail.union(r, s);
        }
        StringBuilder sb = new StringBuilder();
        int[] con = new int[N+1];
        for (int i = 1; i <= N; i++) {
            con[i] += 1;
            for (int j = i+1; j <= N ; j++) {
                if(road.same(i, j) && rail.same(i, j)){
                    con[i]++;
                    con[j]++;
                }
            }
            sb.append(con[i]);
            if(i < N) sb.append(" ");
        }

        System.out.println(sb.toString());
        sc.close();
    }

}

class DJSet {
    // 親を保持する。根は負の数を持つ。（負の数の場合、絶対値がその集合のrank）
    public int[] upper;

    public DJSet(int n){
        upper = new int[n];
        Arrays.fill(upper, -1);
    }

    /*
     * 要素xが含まれる集合のrootを求める.
     * rootを求める過程で経路圧縮しrootが親になるようにする.
     */
    public int root(int x){
        return upper[x] < 0 ? x : (upper[x] = root(upper[x]));
    }

    /*
     * 要素xと要素yが同じ集合か判定する.
     */
    public boolean same(int x, int y){
        return root(x) == root(y);
    }

    /*
     * 要素xと要素yを含むそれぞれの集合を合併する.
     * 要素数の多い集合のrootを残し、少ないほうのrootをその下に合併する.
     */
    public boolean union(int x, int y){
        x = root(x);
        y = root(y);
        if(x != y){
            if(upper[y] < upper[x]){
                int t = x;
                x = y;
                y = t;
            }
            upper[x] += upper[y];
            upper[y] = x;
        }
        return x == y;
    }

    /*
     * 集合の数を数える.
     */
    public int count(){
        int c = 0;
        for(int u :upper){
            if(u < 0) c++;
        }
        return c;
    }
}
