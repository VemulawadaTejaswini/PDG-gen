import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int h = Integer.parseInt(sc.next());

        // 主処理
        int result = (a + b) * h / 2;

        // 出力
        System.out.println(result);
        sc.close();
    }
}
