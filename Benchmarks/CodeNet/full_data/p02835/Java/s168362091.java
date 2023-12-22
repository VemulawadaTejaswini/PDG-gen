import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int a1 = Integer.parseInt(sc.next());
        int a2 = Integer.parseInt(sc.next());
        int a3 = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        boolean judge = 22 <= a1 + a2 + a3;
        String result = judge ? "bust" : "win";

        // 出力
        System.out.println(result);
    }
}
