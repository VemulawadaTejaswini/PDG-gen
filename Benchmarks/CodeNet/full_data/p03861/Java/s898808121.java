import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        long x = Long.parseLong(sc.next());
        sc.close();

        // 主処理
        long countA = a == 0 ? -1 : (a - 1) / x;
        Long countB = b / x;
        long result = countB - countA;

        // 出力
        System.out.println(result);
    }
}
