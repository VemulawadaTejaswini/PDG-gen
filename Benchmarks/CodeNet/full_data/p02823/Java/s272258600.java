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
        long tmp = 0;
        if ((b - a) % 2 == 0) {
            tmp = (b - a) / 2;
        }
        out = (b - 1) <= (n - a) ? (b - 1) : (n - a);
        if (out == 0) {
            out = 1;
        }
        if (tmp != 0 && tmp < out) {
            out = tmp;
        }

        // 出力
        System.out.println(out);
    }
}