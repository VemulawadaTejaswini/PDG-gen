import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        // 主処理
        final String CORRECT = "CODEFESTIVAL2016";
        int result = 0;
        for (int i = 0; i < CORRECT.length(); i++) {
            if (s.charAt(i) != CORRECT.charAt(i)) {
                result++;
            }
        }

        // 出力
        System.out.println(result);
    }
}
