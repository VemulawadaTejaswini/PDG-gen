import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        boolean judge = a % 3 == 0 || b % 3 == 0 || (a + b) % 3 == 0;
        String result = judge ? "Possible" : "Impossible";

        // 出力
        System.out.println(result);
    }
}
