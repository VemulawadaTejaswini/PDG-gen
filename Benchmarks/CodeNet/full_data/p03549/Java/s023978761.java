import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        int confirm = (n - m) * 100;
        int half = m * 1900;
        int result = (confirm + half) * (int) Math.pow(2, m);

        // 出力
        System.out.println(result);
    }
}
