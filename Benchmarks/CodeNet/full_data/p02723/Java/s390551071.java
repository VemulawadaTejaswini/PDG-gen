import java.util.*;
import javax.lang.model.util.ElementScanner6;
//import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        String s = sc.next();

        // 処理
        String out = "Yes";

        if (s.charAt(2) != s.charAt(3)) {
            out = "No";
        } else if (s.charAt(4) != s.charAt(5)) {
            out = "No";
        }

        // 出力
        System.out.println(out);
    }
}