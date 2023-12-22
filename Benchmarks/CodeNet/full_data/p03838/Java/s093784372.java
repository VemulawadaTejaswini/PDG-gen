import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());

        // 主処理
        int result = 0;
        if (x < 0) {
            x *= -1;
            result++;
        }
        if (y < 0) {
            y *= -1;
            result++;
        }
        result += Math.abs(x - y);

        // 出力
        System.out.println(result);
        sc.close();
    }
}
