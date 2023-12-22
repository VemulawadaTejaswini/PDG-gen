import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BFindSymmetries solver = new BFindSymmetries();
        solver.solve(1, in, out);
        out.close();
    }

    static class BFindSymmetries {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            // 愚直な全探索はn^4なので間に合わない
        /*
            i,j -> i+a, j+b への移動を行った結果,
            移動先での
            (x,y) = (y,x)ならよいことになる

            (i, j)  <->  (j + b - a, i + a - b)
            の対応関係が必要
            つまり各a-bについて考えればいい。
            これは a-b = x とおいたときに
            (i, j) <-> (j - x, i + x) ただし、(-(n-1) <= x <= (n-1))
            の対応さえ考えればよく、これらは同じ…？

            つまり
            for x [-(n-1), n)
                for i in [0 , n)
                    for j in [0 , n)
                        対応していないならfalse
                trueならそれを満たす数だけ(※)足せばいい

            満たす数の計算は
            0 -> (0,1,2,3,,,n-1);n
            なのでnから絶対値を引いた数だけ足せばいい
            つまり
            ans += n - math.abs(x)
            これを書いていくことにする
        */

            int n = in.nextInt();
            char[][] a = new char[n][n];
            int ans = 0;
            for (int i = 0; i < n; i++) {
                a[i] = in.next().toCharArray();
            }

            for (int x = -(n - 1); x < n; x++) {
                boolean f = true;
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        f = f && (a[i][j] == a[(j - x + n) % n][(i + x + n) % n]);
                    }
                }
                if (f) ans += n - Math.abs(x);
            }

            out.println(ans);
        }

    }
}

