import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        n -= 2 <= n ? 2 : 0;
        m -= 2 <= m ? 2 : 0;
        int result = n * m;

        // 出力
        System.out.println(result);
    }
}
