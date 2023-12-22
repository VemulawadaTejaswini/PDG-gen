import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        // 主処理
        char head = s.charAt(0);
        char foot = s.charAt(s.length() - 1);
        String result = "" + head + (s.length() - 2) + foot;

        // 出力
        System.out.println(result);
    }
}
