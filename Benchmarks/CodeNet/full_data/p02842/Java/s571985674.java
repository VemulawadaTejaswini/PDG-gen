import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        int before = (int) Math.ceil(n / 1.08);
        String result = (int) (before * 1.08) == n ? Integer.toString(before) : ":(";

        // 出力
        System.out.println(result);
    }
}
