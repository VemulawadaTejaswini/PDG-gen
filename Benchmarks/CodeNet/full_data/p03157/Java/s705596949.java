import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        char[][] grid = new char[H][W];
        for(int i = 0; i < H; i++) grid[i] = sc.next().toCharArray();
        sc.close();
        DJSet ds = new DJSet(H*W);
        for(int i = 0; i < H; i++){
            for(int j = 0; j < W; j++){
                if(i+1 < H && grid[i][j] != grid[i+1][j]){
                    ds.union(i*W +j, (i+1)*W +j);
                }
                if(j+1 < W && grid[i][j] != grid[i][j+1]){
                    ds.union(i*W +j, i*W +j +1);
                }
            }
        }
        int[] b = new int[H*W];
        int[] w = new int[H*W];
        for(int i = 0; i < H; i++){
            for(int j = 0; j < W; j++){
                if(grid[i][j] == '.') w[ds.root(i*W +j)]++;
                else b[ds.root(i*W +j)]++;
            }
        }
        int ans = 0;
        for(int i = 0; i < H*W; i++){
            ans += b[i]*w[i];
        }
        System.out.println(ans);
    }

}

class DJSet {
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
