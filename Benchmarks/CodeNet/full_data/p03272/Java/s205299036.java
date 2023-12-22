import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int i = Integer.parseInt(sc.next());

        // 主処理
        int result = n - i + 1;

        // 出力
        System.out.println(result);
        sc.close();
    }
}
