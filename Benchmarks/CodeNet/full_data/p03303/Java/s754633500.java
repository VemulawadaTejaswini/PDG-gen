import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int w = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        String result = "";
        for (int i = 0; i < s.length(); i += w) {
            result += s.charAt(i);
        }

        // 出力
        System.out.println(result);
    }
}
