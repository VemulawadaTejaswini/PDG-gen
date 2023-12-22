import java.util.*;
import javax.lang.model.util.ElementScanner6;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        long h = sc.nextLong();

        // 処理
        long cnt = 1;
        long out = 0;
        while (h > 1) {
            out += cnt;
            h /= 2;
            cnt *= 2;
        }
        out += cnt;

        // 出力
        System.out.println(out);
    }
}