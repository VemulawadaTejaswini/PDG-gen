import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        String[][] s = new String[h][w];
        for (int i = 0; i < h; i++) {
            s[i] = sc.next().split("");
        }
        sc.close();

        // 主処理
        int[] pointX = new int[] { 0, 1, 1, 1, 0, -1, -1, -1 }; // 上,右上,右,...,左上
        int[] pointY = new int[] { 1, 1, 0, -1, -1, -1, 0, 1 };
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (".".equals(s[i][j])) {
                    int count = 0;
                    for (int k = 0; k < 8; k++) {
                        int x = j + pointX[k];
                        int y = i + pointY[k];
                        if (0 <= y && y < h && 0 <= x && x < w) {
                            String target = s[y][x];
                            if ("#".equals(target)) {
                                count++;
                            }
                        }
                    }
                    s[i][j] = Integer.toString(count);
                }
            }
        }

        String[] lines = new String[h];
        for (int i = 0; i < h; i++) {
            lines[i] = String.join("", s[i]);
        }
        String result = String.join("\n", lines);

        // 出力
        System.out.println(result);
    }
}
