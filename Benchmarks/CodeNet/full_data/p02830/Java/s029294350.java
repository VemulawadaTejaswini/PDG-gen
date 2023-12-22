import java.util.*;
import javax.lang.model.util.ElementScanner6;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        int n = sc.nextInt();
        String s = sc.next();
        String t = sc.next();

        StringBuffer tmp = new StringBuffer();
        for (int i = 0; i < n; i++) {
            tmp.append(s.charAt(i));
            tmp.append(t.charAt(i));
        }
        String out = tmp.toString();

        // 出力
        System.out.println(out);
    }
}