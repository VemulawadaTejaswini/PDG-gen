import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next()) - 1;
        int b = Integer.parseInt(sc.next()) - 1;
        int c = Integer.parseInt(sc.next()) - 1;
        int d = Integer.parseInt(sc.next()) - 1;
        String s = sc.next();
        sc.close();

        // 主処理
        boolean judge = canThroughtWall(s, a, c) && canThroughtWall(s, b, d); // 2連続で壁がないことをチェック
        // cの移動経路がaと完全に重なる場合
        if (b < c && d < c) {
            judge = judge && canMoveNotWallSide(s, b, d);
        }
        String result = judge ? "Yes" : "No";

        // 出力
        System.out.println(result);
    }

    public static boolean canThroughtWall(String s, int startIndex, int endIndex) {
        for (int i = startIndex; i < endIndex; i++) {
            char left = s.charAt(i);
            char right = s.charAt(i + 1);
            if (left == '#' && right == '#') {
                return false;
            }
        }
        return true;
    }

    public static boolean canMoveNotWallSide(String s, int startIndex, int endIndex) {
        for (int i = startIndex; i < endIndex; i++) {
            char left = s.charAt(i - 1);
            char right = s.charAt(i + 1);
            if (s.charAt(i) == '.' && left == '.' && right == '.') {
                return true;
            }
        }
        return false;
    }
}
