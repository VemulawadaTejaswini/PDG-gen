import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());

        // 主処理
        int result = 0;
        int diff = b - a;
        if (diff % 2 == 0) {
            result = diff / 2;
        } else {
            if (a - 1 < n - b) {
                result = b - 1;
            } else {
                result = n - a;
            }
        }

        // 出力
        System.out.println(result);
        sc.close();
    }
}
