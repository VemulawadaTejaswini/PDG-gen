import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        // 主処理
        int result = 700 + (s.length() - s.replace("o", "").length()) * 100;

        // 出力
        System.out.println(result);
        sc.close();
    }
}
