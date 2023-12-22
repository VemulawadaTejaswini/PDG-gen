import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        // 主処理
        char c = 'a';
        for (int i = 0; i < 26; i++) {
            c += 1;
            if (!s.contains(String.valueOf(c))) {
                break;
            }
        }

        boolean judge = c != '{';
        String result = judge ? String.valueOf(c) : "None";

        // 出力
        System.out.println(result);
    }
}
