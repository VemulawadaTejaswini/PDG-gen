import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        // 主処理
        int countW = s.replaceAll("[^W]", "").length();

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'W') {
                result += (i + 1) - countW;
                countW--;
            }
        }

        // 出力
        System.out.println(result);
    }
}
