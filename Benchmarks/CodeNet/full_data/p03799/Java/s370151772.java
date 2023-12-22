import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        int count = 0;
        if (m / 2 <= n) {
            count = m / 2;
        } else {
            int remainC = m - (n * 2);
            count = remainC / 4 + n;
        }
        int result = count;

        // 出力
        System.out.println(result);
    }
}
