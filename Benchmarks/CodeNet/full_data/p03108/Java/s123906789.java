import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    // Parents[i]:iの親の番号
    static List<Integer> Parents = new ArrayList<>();
    // Rank[i]:iについているノード数（高さ）
    static List<Integer> Rank = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[m];
        int[] b = new int[m];

        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt()-1;
            b[i] = sc.nextInt()-1;
        }

        // 最初はすべてが根であるとして初期化
        for (int i = 0; i < n; i++) {
            Parents.add(i);
            Rank.add(1);
        }
        
        long[] ans = new long[m];   // 答え
        ans[m-1] = n * (n-1) / 2;   // 一番最後は最悪の場合
        
        // 全て破壊された場合から残ってる数を引くことでポイントを計算
        for (int i = m-1; i >= 1; i--) {
            ans[i-1] = ans[i];

            if (root(a[i]) != root(b[i])) {
                ans[i-1] -= size(a[i]) * size(b[i]);
                unite(a[i], b[i]);
            }
        }

        // 出力
        for (long i : ans)
            System.out.println(i);
    }

    // データが属する木の根を再帰で得る
    static int root(int x) {
        if (Parents.get(x) == x)
            return x;
        Parents.set(x, root(Parents.get(x)));
        return Parents.get(x);
    }

    // xとyの木を併合
    static void unite(int x, int y) {
        int rx = root(x);
        int ry = root(y);
        if (rx == ry)
            return;
        if (Rank.get(rx) < Rank.get(ry)) {
            Parents.set(rx, ry);
            Rank.set(ry, Rank.get(ry)+1);
        } else {
            Parents.set(ry, rx);
            if (Rank.get(rx) == Rank.get(ry))
                Rank.set(rx, Rank.get(rx)+1);
        }
    }

    // 2つのデータx, yが属する木が同じならtrueを返す
    static boolean same(int x, int y) {
        int rx = root(x);
        int ry = root(y);
        return rx == ry;
    }

    // 頂点の数(Rank)を返す
    static int size(int x) {
        return Rank.get(root(x));
    }
}
