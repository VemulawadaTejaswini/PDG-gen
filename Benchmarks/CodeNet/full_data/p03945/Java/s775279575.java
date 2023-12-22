import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        // 主処理

        int result = s.length() - (s.replace("BW", "").length() + s.replace("WB", "").length()) / 2;

        // 出力
        System.out.println(result);
    }
}
