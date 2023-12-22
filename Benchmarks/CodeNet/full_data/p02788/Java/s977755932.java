import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt()*2;
        int a = sc.nextInt();
        int[][] x = new int[n][2];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            x[i][0] = sc.nextInt();
            x[i][1] = sc.nextInt();
            b[i] = x[i][0];
        }
        Arrays.sort(x, (s, t) -> s[0] - t[0]);
        Arrays.sort(b);
        LazySegTree_RSQ seg = new LazySegTree_RSQ(n);
        long ans = 0L;
        for (int i = 0; i < n; i++) {
            int rest = x[i][1] - (int)seg.max(i, i+1, 0, 0, seg.size);
            if(rest < 1) continue;
            int num = (int) Math.ceil((double)rest / a);
            int r = Arrays.binarySearch(b, b[i]+d);
            if(r < 0) r = ~r -1;
            seg.add(i, r+1, num*a, 0, 0, seg.size);
            ans += num;
        }
        System.out.println(ans);
        sc.close();

    }

}

class LazySegTree_RSQ {

    public int n;
    public int size;
    /**
     * 要素全体を含むノードのindex：0.
     * k番目(0-indexed)の要素のindex：k + size - 1
     * ノードkの親要素のindex：(k - 1) / 2.
     * ノードkの子要素のうち左側のindex：k*2+1.
     * ノードkの子要素のうち右側のindex：k*2+2.
     */
    public long[] data;
    public long[] lazy;

    /**
     * コンストラクタ.
     * @param n 要素数
     */
    public LazySegTree_RSQ(int n){
        this.n = n;
        size = 1;
        while(size < n) size *= 2;
        data = new long[size*2];
        lazy = new long[size*2];
    }

    /**
     * 指定したノードが遅延評価待ちの値を保持している場合、
     * 自ノードに反映し、子ノードの遅延評価待ちとして設定する。
     * @param k 自ノードのindex
     * @param l 自ノードの対象区間左側（含む）
     * @param r 自ノードの対象区間右側（含まない）
     */
    public void eval(int k, int l, int r){
        if(lazy[k] != 0){
            data[k] += lazy[k];
            if(1 < r - l){
                lazy[2*k+1]  += lazy[k] / 2;
                lazy[2*k+2]  += lazy[k] / 2;
            }
            lazy[k] = 0L;
        }
    }

    /**
     * 区間[a, b)での○○を求めます.
     * 最初に呼ぶ際は、query(a, b, x, 0, 0, size)として呼ぶ.
     * @param a 求める区間の下限（含む）
     * @param b 求める区間の上限（含まない）
     * @param k 確認するノードのindex
     * @param l 確認するノードの下限（含む）
     * @param r 確認するノードの上限（含まない）
     * @return 区間[a, b)での○○
     */
    public void add(int a, int b, int x, int k, int l, int r){
        eval(k, l, r);

        // 区間外
        if(b <= l || r <= a) return;

        // 完全に含む
        if(a <= l && r <= b){
            lazy[k] += (long)(r - l) * x;
            eval(k, l, r);
            return;
        }

        // それ以外
        add(a, b, x, 2*k+1, l, (l+r)/2);
        add(a, b, x, 2*k+2, (l+r)/2, r);
        data[k] = data[2*k+1] + data[2*k+2];
    }

    /**
     * 最初に呼ぶ際は、query(a, b, 0, 0, size)として呼ぶ.
     * @param a 求める区間の下限（含む）
     * @param b 求める区間の上限（含まない）
     * @param k 確認するノードのindex
     * @param l 確認するノードの下限（含む）
     * @param r 確認するノードの上限（含まない）
     * @return 区間[a, b)の和
     */
    public long max(int a, int b, int k, int l, int r){
        // 区間外
        if(b <= l || r <= a) return 0;
        eval(k, l, r);
        // 完全に含む
        if(a <= l && r <= b) return data[k];
        // それ以外
        long vl = max(a, b, 2*k+1, l, (l+r)/2);
        long vr = max(a, b, 2*k+2, (l+r)/2, r);
        return Math.max(vl, vr);
    }
}
