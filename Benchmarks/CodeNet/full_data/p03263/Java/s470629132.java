import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DMakeThemEven solver = new DMakeThemEven();
        solver.solve(1, in, out);
        out.close();
    }

    static class DMakeThemEven {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            /* == 入力部       開始 == */
            int h = in.nextInt();                           // 盤面の横幅
            int w = in.nextInt();                           // 盤面の縦幅
            List<DMakeThemEven.Operation> operations = new ArrayList<>(); // 解答
            /* == 入力部       開始 == */

            /* == 計算部(1)    開始 == */
            /* vParity[i] = (i + 1,1)要素から(i + 1,y + 1)要素までの和が奇数ならtrue -> コインを下に押し付けます */
            boolean[] vParity = new boolean[w];
            for (int y = 0; y < h - 1; y++) {   // 上から下へ(最終行を除く)
                for (int x = 0; x < w; x++) {   // 左から右へ
                    vParity[x] ^= in.nextInt() % 2 == 1; // 偶奇の和はXORで求まります
                    if (vParity[x]) { // 奇数ならば下の行にコインを押し付けます
                        operations.add(new DMakeThemEven.Operation(x + 1, y + 1, x + 1, y + 2));
                    }
                }
            }
            /* == 計算部(1)    終了 == */


            /* == 計算部(2)    開始 == */
            /* hParity = (x + 1, h)要素が奇数ならtrue -> コインを右に押し付ける */
            boolean hParity = false;
            for (int x = 0; x < w - 1; x++) {   // 左から右へ
                // (x + 1, h)要素の偶奇性は [もともとその場所にあるコイン] XOR [上から押し付けられたコイン]
                //                                                   XOR [左から押し付けられたコイン]
                hParity ^= vParity[x];
                hParity ^= in.nextInt() % 2 == 1;
                if (hParity) { // 奇数ならば右の列にコインを押し付けます
                    operations.add(new DMakeThemEven.Operation(x + 1, h, x + 2, h));
                }
            }
            /* == 計算部(2)    終了 == */


            /* == 出力部    開始 == */
            out.println(operations.size());
            for (DMakeThemEven.Operation operation : operations) {
                out.print(operation.y1);
                out.print(' ');
                out.print(operation.x1);
                out.print(' ');
                out.print(operation.y2);
                out.print(' ');
                out.println(operation.x2);
            }
            /* == 出力部    終了 == */
        }

        public static class Operation {
            int x1;
            int y1;
            int x2;
            int y2;

            public Operation(int a, int b, int c, int d) {
                this.x1 = a;
                this.y1 = b;
                this.x2 = c;
                this.y2 = d;
            }

        }

    }
}

