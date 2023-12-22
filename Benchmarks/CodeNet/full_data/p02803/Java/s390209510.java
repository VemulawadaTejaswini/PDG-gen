import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());

        char[][] s = new char[h][w];
        for (int i = 0; i < h; i++) {
            s[i] = sc.next().toCharArray();
        }

        // 全ての座標をスタートとして、ゴールまでにかかる移動回数の最大を求める
        int result = 0;
        for (int k = 0; k < h; k++) {
            for (int l = 0; l < w; l++) {

                // スタート座標を設定
                if (s[k][l] != '.') {
                    break;
                }
                int start[] = new int[] { k, l };

                // 探索対象を保持する
                Deque<int[]> todo = new ArrayDeque<>();
                todo.add(start); // スタート座標を設定

                // 探索済みの位置を保持する（0を未探索と判定）
                int[][] countStep = new int[h][w];
                countStep[start[0]][start[1]] = 1; // スタート座標を設定

                // 探索対象の相対座標を設定（上下左右）
                // 探索をforループで実施するために必要
                int[] x = new int[] { 0, 0, -1, 1 };
                int[] y = new int[] { -1, 1, 0, 0 };

                // 探索を開始
                int maxStep = 0; // スタートからゴールまでの距離が格納される
                while (!todo.isEmpty()) {

                    // 探索元の位置を設定
                    int[] point = todo.poll();
                    int pointY = point[0];
                    int pointX = point[1];

                    // 上下左右を探索する
                    for (int i = 0; i < 4; i++) {

                        // 探索対象の位置
                        int nextPointX = pointX + x[i];
                        int nextPointY = pointY + y[i];

                        // 場外判定
                        boolean isOutside = nextPointX < 0 || w <= nextPointX || nextPointY < 0 || h <= nextPointY;
                        if (!isOutside) {

                            boolean wasVisit = 0 < countStep[nextPointY][nextPointX]; // 探索済み判定
                            boolean isWall = s[nextPointY][nextPointX] == '#'; // 壁判定
                            if (!wasVisit && !isWall) {

                                // 探索対象に追加
                                todo.add(new int[] { nextPointY, nextPointX });
                                countStep[nextPointY][nextPointX] = countStep[pointY][pointX] + 1;
                                maxStep = countStep[nextPointY][nextPointX] - 1; // 初期値の1を引く
                            }
                        }
                    }
                }
                result = Math.max(result, maxStep);
            }
        }

        // 出力
        System.out.println(result);
        sc.close();
    }
}
