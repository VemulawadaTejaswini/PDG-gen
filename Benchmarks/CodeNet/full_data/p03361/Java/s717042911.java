import java.util.*;

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
        sc.close();

        // 主処理
        int[] pointX = new int[] { 0, 0, -1, 1 }; // 上下左右
        int[] pointY = new int[] { 1, -1, 0, 0 };

        boolean judge = true;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                int x = j;
                int y = i;
                if (s[y][x] == '#') {
                    boolean isLink = false;
                    for (int k = 0; k < 4; k++) {
                        int targetX = x + pointX[k];
                        int targetY = y + pointY[k];
                        if (0 <= targetX && 0 <= targetY && targetX < h && targetY < w) {
                            if (s[targetY][targetX] == '#') {
                                isLink = true;
                            }
                        }
                    }
                    if (!isLink) {
                        judge = false;
                    }
                }
            }
        }
        String result = judge ? "Yes" : "No";

        // 出力
        System.out.println(result);
    }
}
