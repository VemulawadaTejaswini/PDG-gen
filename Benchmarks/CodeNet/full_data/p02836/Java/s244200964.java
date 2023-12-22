import java.util.*;
import javax.lang.model.util.ElementScanner6;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        String s = sc.next();

        int out = 0;
        int h = 0;
        int t = s.length() - 1;
        while (h < t) {
            if (s.charAt(h) != s.charAt(t)) {
                out += 1;
            }
            h += 1;
            t -= 1;
        }

        // 出力
        System.out.println(out);
    }
}