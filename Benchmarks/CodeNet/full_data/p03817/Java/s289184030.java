import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        long x = Long.parseLong(sc.next());
        sc.close();

        // 主処理
        long remain = x % 11;
        long result = x / 11 * 2 + (long) Math.ceil(remain / 6.0);

        // 出力
        System.out.println(result);
    }
}
