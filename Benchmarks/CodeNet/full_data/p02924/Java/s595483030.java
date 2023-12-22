import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        // 主処理
        long result = 0;
        for (int i = 0; i < n; i++) {
            result += i;
        }

        // 出力
        System.out.println(result);
        sc.close();
    }
}
