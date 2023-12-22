import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        char[][] a = new char[h][w];
        for (int i = 0; i < h; i++) {
            a[i] = sc.next().toCharArray();
        }
        sc.close();

        // 主処理
        int[][] count = new int[h][w];

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (i == 0 && j == 0) {
                    count[i][j] = a[i][j] == '#' ? 1 : 0;
                } else if (i == 0) {
                    int left = (a[i][j] == '.' || a[i][j] == '#' && a[i][j - 1] == '#') ? count[i][j - 1]
                            : count[i][j - 1] + 1;
                    count[i][j] = left;
                } else if (j == 0) {
                    int up = (a[i][j] == '.' || a[i][j] == '#' && a[i - 1][j] == '#') ? count[i - 1][j]
                            : count[i - 1][j] + 1;
                    count[i][j] = up;
                } else {
                    int left = (a[i][j] == '.' || a[i][j] == '#' && a[i][j - 1] == '#') ? count[i][j - 1]
                            : count[i][j - 1] + 1;
                    int up = (a[i][j] == '.' || a[i][j] == '#' && a[i - 1][j] == '#') ? count[i - 1][j]
                            : count[i - 1][j] + 1;
                    count[i][j] += Math.min(up, left);
                }
            }
        }
        int result = count[h - 1][w - 1];

        // 出力
        System.out.println(result);
    }
}
