import java.util.*;
import javax.lang.model.util.ElementScanner6;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        String c = sc.next();

        // 処理
        char out = c.toCharArray()[0];
        out++;

        // 出力
        System.out.println(out);
    }
}