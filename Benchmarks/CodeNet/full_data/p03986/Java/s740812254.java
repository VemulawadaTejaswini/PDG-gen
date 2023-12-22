import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        sc.close();

        // 主処理
        while (x.contains("ST")) {
            x = x.replace("ST", "");
        }
        int result = x.length();

        // 出力
        System.out.println(result);
    }
}
