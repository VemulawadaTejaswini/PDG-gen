import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        DJSet ds = new DJSet(n);
        int[][] b = new int[m][2];
        for (int i = 0; i < m; i++) b[i] = new int[]{sc.nextInt()-1, sc.nextInt()-1};
        long ans[] = new long[m];
        List<Integer> r = new ArrayList<>();
        for (int i = m-1; i >= 0; i--) {
            long cnt = 0L;
            for (int j : r) {
                int unionedCnt = ds.countElement(j);
                cnt += unionedCnt;
                long notUnionedCnt = (long)n - unionedCnt;
                ans[i] += unionedCnt * notUnionedCnt;
            }
            if(cnt < n) ans[i] += (n - cnt) * (n -1);
            ans[i] /= 2;
            boolean notUnioned = true;
            for(int j : r){
                if(ds.same(j, b[i][0]) || ds.same(j, b[i][1])){
                    notUnioned = false;
                    break;
                }
            }
            if(notUnioned) r.add(b[i][0]);
            else if(!ds.same(b[i][0], b[i][1])
                    && r.contains(ds.root(b[i][0]))
                    && r.contains(ds.root(b[i][1]))){
                r.remove(Integer.valueOf(ds.root(b[i][1])));
            }
            ds.union(b[i][0], b[i][1]);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            sb.append(ans[i]).append("\n");
        }

        System.out.println(sb.toString());
        sc.close();
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
