import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int m1 = Integer.parseInt(sc.next());
        int d1 = Integer.parseInt(sc.next());
        int m2 = Integer.parseInt(sc.next());
        int d2 = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        boolean judge = m1 != m2;
        int result = judge ? 1 : 0;

        // 出力
        System.out.println(result);
    }
}
