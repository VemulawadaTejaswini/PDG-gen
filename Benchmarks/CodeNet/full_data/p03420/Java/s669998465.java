import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        int result = 0;
        for (int i = k; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (k <= i % j) {
                    result++;
                }
                if (k <= j % i) {
                    result++;
                }
            }
        }

        // 出力
        System.out.println(result);
    }
}
