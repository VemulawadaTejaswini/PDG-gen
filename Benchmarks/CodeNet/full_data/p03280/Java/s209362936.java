import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());

        // 主処理
        int result = (a - 1) * (b - 1);

        // 出力
        System.out.println(result);
        sc.close();
    }
}
