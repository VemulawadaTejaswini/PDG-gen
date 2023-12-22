import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        String[][] s = new String[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                s[i][j] = sc.next();
            }
        }
        sc.close();

        // 主処理
        String result = "";
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if ("snuke".equals(s[i][j])) {
                    result = String.valueOf((char) ((int) 'A' + j)) + (i + 1);
                }
            }
        }

        // 出力
        System.out.println(result);
    }
}
