import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        // abc 129

        int h = sc.nextInt();
        int w = sc.nextInt();
        String[][] list = new String[h][];

        for (int i = 0; i < h; i++) {
            list[i] = sc.next().split("");
        }

        int ans = 0;

        // 重複して確認しに行っているからTLEする
        // 縦横で一旦全区間埋めていけば自ずと出る気がしてきた

        int[][] xList = new int[h][w];
        int[][] yList = new int[w][h];

        // 縦を集計する
        for (int j = 0; j < w; j++) {
            int count = 0;
            int start = 0;
            for (int k = 0; k < h; k++) {
                if (list[k][j].equals("#")) {
                    Arrays.fill(yList[j], start, Math.max(start, k - 1), count);
                    count = 0;
                    start = k + 1;
                } else {
                    count++;
                }
            }
            if (start != h) {
                Arrays.fill(yList[j], start, h - 1, count);
            }
        }

        // 横を集計する
        for (int j = 0; j < h; j++) {
            int count = 0;
            int start = 0;
            for (int k = 0; k < w; k++) {
                if (list[j][k].equals("#")) {
                    Arrays.fill(xList[j], start, Math.max(start, k - 1), count);
                    count = 0;
                    start = k + 1;
                } else {
                    count++;
                }
            }
            if (start != w) {
                Arrays.fill(xList[j], start, w - 1, count);
            }
        }

        // 縦
        for (int i = 0; i < h; i++) {
            // 横
            for (int j = 0; j < w; j++) {
                if (list[i][j].equals("#")) {
                    continue;
                }
                ans = Math.max(ans, xList[i][j] + yList[j][i]);
            }
        }
        System.out.println(--ans);
    }
}