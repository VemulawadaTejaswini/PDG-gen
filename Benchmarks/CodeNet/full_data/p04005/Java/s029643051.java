import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        int result = 0;
        if (a % 2 == 1 && b % 2 == 1 && c % 2 == 1) {
            int ab = a * b;
            int bc = b * c;
            int ac = a * c;
            result = Math.min(Math.min(ab, bc), ac);
        }

        // 出力
        System.out.println(result);
    }
}
