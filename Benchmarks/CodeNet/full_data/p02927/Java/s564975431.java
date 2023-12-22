import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int m = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        int result = 0;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= d; j++) {
                if (2 <= (j / 10) && 2 <= (j % 10) && ((j / 10) * (j % 10) == i)) {
                    result++;
                }
            }
        }

        // 出力
        System.out.println(result);
    }
}
