import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        // 主処理
        char result = (char) ((int) s.charAt(0) + 1);

        // 出力
        System.out.println(result);
    }
}
