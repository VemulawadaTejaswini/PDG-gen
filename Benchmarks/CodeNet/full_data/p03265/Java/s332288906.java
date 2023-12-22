import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int[] ans = solve(x1, y1, x2, y2);
        for (int elm : ans) {
            System.out.printf("%s ", elm);
        }
    }

    static int[] solve(int x1, int y1, int x2, int y2) {
        // 正方形の辺の長さと、辺の長さから対角線の長さを計算する
        double euclidDistance = calcEuclid(x1, x2, y1, y2);
        double diagonalDist = calcDiagonal(euclidDistance);

        // 計算した対角線距離と各頂点を利用して、次の頂点を計算する
        int[] xy3 = calcPoint(x1, x2, y1, y2, diagonalDist, euclidDistance);
        int[] xy4 = calcPoint(x2, xy3[0], y2, xy3[1], diagonalDist, euclidDistance);

        int[] ans = new int[4];
        ans[0] = xy3[0];
        ans[1] = xy3[1];
        ans[2] = xy4[0];
        ans[3] = xy4[1];
        return ans;
    }

    /**
     * 線分距離を計算する
     * <p>
     * return = √(x1-x2)^2 + (y1-y2)^2<br>
     * 入力は負数でも構わないが、整数のみ。
     *
     * @return 線分距離
     */
    static double calcEuclid(int x1, int x2, int y1, int y2) {
        int t = (int) (Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        return Math.sqrt(t);
    }

    /**
     * 線分距離から正方形の対角線の距離を計算する
     * <p>
     * return = √2 * 線分距離
     *
     * @param d 線分距離
     * @return 正方形の対角線の距離
     */
    static double calcDiagonal(double d) {
        return Math.sqrt(2) * d;
    }

    static int[] calcPoint(int fromX, int nextX, int fromY, int nextY, double diagonal,
            double outline) {
        // System.out.printf("(%s, %s) -> (%s, %s) ...\n", fromX, fromY, nextX, nextY);
        int[] ans = new int[2];
        // 制約が100なので、正方形は倍の枠内に収まる
        for (int x = -400; x <= 400; x++) {
            for (int y = -400; y <= 400; y++) {

                // 正方形なので、全ての辺の長さは一緒
                if (calcEuclid(nextX, x, nextY, y) != outline) {
                    continue;
                }

                // (-100,-100,100,100)のケースで誤差が出たので文字列長で丸める
                double tgt = calcEuclid(fromX, x, fromY, y);
                String t = String.valueOf(tgt);
                String d = String.valueOf(diagonal);
                int min = Math.min(t.length(), d.length());

                // xiとxi+1の対角線上の距離を取る
                if (t.substring(0, min).equals(d.substring(0, min))) {
                    // System.out.printf(" (%s, %s) -> (%s, %s) ...\n", nextX, nextY, x, y);

                    // 方向が正しく設定できればその値を返却する
                    ans = decideVector(x, y, fromX, nextX, fromY, nextY);
                    if (ans[0] != 1000) {
                        return ans;
                    }
                }
            }
        }
        return ans;
    }

    /**
     * (x1,y1)->(x2,y2)の向きによって、次の点の向きを判定しその配列を返す;
     *
     * @return 次点のx,yが格納された配列{x, y}
     */
    private static int[] decideVector(int x, int y, int x1, int x2, int y1, int y2) {

        int[] ans = new int[2];
        Arrays.fill(ans, 1000);
        // x軸が同値の場合、yの値によって左右
        if (x1 == x2) {
            // x軸が同値の場合、y軸によって向きが変わる。xとyどちらも同値ということは制約として存在しない
            if (y1 > y2) {
                // yが負に振れているので、次の点は右側に遷移する
                if (x > x2) {
                    // System.out.printf(" R-- (%s, %s) -> (%s, %s)\n", x2, y2, x, y);
                    ans[0] = x;
                    ans[1] = y;
                }
            } else {
                // yが正に振れているので、次の点は左側に遷移する
                if (x < x2) {
                    // System.out.printf(" L-- %s %s\n", x, y);
                    ans[0] = x;
                    ans[1] = y;
                }
            }
        }

        // x軸が左に遷移しているので、yを下に移動させる
        if (x1 > x2) {
            if (y < y2) {
                // System.out.printf(" U-- %s %s\n", x, y);
                ans[0] = x;
                ans[1] = y;
            }
        }

        // x軸が右に遷移しているので、yを上に移動させる
        if (x1 < x2) {
            if (y > y2) {
                // System.out.printf(" T-- %s %s\n", x, y);
                ans[0] = x;
                ans[1] = y;
            }
        }

        return ans;
    }
}

