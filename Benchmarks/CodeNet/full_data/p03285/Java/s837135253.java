import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        boolean judge = false;
        for (int i = n; 0 <= i; i -= 4) {
            if (i % 7 == 0 || i == 0) {
                judge = true;
            }
        }
        String result = judge ? "Yes" : "No";

        // 出力
        System.out.println(result);
    }
}
