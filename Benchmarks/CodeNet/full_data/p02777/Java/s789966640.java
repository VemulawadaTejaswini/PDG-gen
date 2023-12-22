import java.util.*;
import javax.lang.model.util.ElementScanner6;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        String s = sc.next();
        String t = sc.next();
        long a = sc.nextLong();
        long b = sc.nextLong();
        String u = sc.next();

        // 処理
        if (u.equals(s)) {
            a--;
        } else {
            b--;
        }
        String out = Long.toString(a) + " " + Long.toString(b);

        // 出力
        System.out.println(out);
    }
}