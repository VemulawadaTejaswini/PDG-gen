import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        int min = a / 100;
        int minRev = min / 10 % 10 * 10 + min / 100;
        int minRest = a % 100;
        if (minRev < minRest) {
            min++;
        }

        int max = b / 100;
        int maxRev = max / 10 % 10 * 10 + max / 100;
        int maxRest = b % 100;
        if (maxRest < maxRev) {
            max--;
        }

        int result = max - min + 1;

        // 出力
        System.out.println(result);
    }
}
