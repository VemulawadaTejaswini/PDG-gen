import java.util.Scanner;

public class Main {

    private static int n;
    private static int x;
    private static int y;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ##### 初期読み込み #######################################################################
        // 1行 文字 複数 ----------------------------------------------------------------------------
        String[] stringArray = scanner.nextLine().split(" ");

        n = Integer.parseInt(stringArray[0]);
        x = Integer.parseInt(stringArray[1]);
        y = Integer.parseInt(stringArray[2]);

        // ##### メイン処理 #######################################################################

        int count = 0;
        for (int k = 1; k <= n-1; k++) {
            count = 0;
            for (int i = 1; i < n; i++) {
                count += count(i, k, false);
            }
            System.out.println(count);
        }
    }

    private static int count(int i, int kyori, boolean passx) {
//        System.out.println("i: " + i + ", kyori: " + kyori + ", passx: " + passx);
        // 距離ゼロの場合はルートあり
        if (kyori == 0) return 1;

        // 距離が1以上の場合は探索を続ける


        // 現在地がXの場合は2つのルートを探索する
        if (i == x) {
            int count = 0;
            // 次のノード
            count += count(i+1, kyori-1, true);
            // ノードY
            count += count(y, kyori-1, true);
            return count;
        }

        // 現在地がXではない場合
        if (passx) {
            // X通過後はノードYには進めない
            if (i+1 <= n && i+1 != y) {
                return count(i+1, kyori-1, passx);
            }
        } else {
            // X通過してなければノードY通れる
            if (i+1 <= n) {
                return count(i+1, kyori-1, passx);
            }
        }
        // 到達できなかった場合は探索失敗
        return 0;
    }
}