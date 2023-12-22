import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        long x = Long.parseLong(sc.next());
        long y = Long.parseLong(sc.next());

        // 主処理
        long result = 0;
        long count = x;
        while (count <= y) {
            count *= 2;
            result++;
        }

        // 出力
        System.out.println(result);
        sc.close();
    }
}
