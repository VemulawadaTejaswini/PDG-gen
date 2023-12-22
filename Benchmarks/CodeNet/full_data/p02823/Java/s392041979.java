import java.util.*;
import javax.lang.model.util.ElementScanner6;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();

        // 処理
        long out = 0;
        if ((b - a) % 2 == 0) {
            out = (b - a) / 2;
        } else {
            out = (b - 1) < (n - a) ? (b - 1) : (n - a);
        }

        // 出力
        System.out.println(out);
    }
}