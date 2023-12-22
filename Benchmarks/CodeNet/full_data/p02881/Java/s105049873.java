import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());

        // 主処理
        long rt = (long) Math.sqrt(n);
        while (n % rt != 0) {
            rt--;
        }
        long result = rt + n / rt - 2;

        // 出力
        System.out.println(result);
        sc.close();
    }
}
