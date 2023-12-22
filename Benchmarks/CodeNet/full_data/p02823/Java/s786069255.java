import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());

        // 主処理
        long result = 0;
        long diff = b - a;
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
