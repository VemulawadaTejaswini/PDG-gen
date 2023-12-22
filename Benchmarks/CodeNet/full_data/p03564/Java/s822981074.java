import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        int num = 1;
        for (int i = 0; i < n; i++) {
            int d = num * 2;
            int p = num + k;
            num = Math.min(d, p);
        }
        int result = num;

        // 出力
        System.out.println(result);
    }
}
