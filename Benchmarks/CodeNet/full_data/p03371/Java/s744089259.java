import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());

        // 主処理
        int max = Math.max(x, y);
        int min = Math.min(x, y);
        int allHalf = c * max * 2;
        int noHalf = a * x + b * y;
        int both = c * min * 2 + a * (x - min) + b * (y - min);
        int result = Math.min(Math.min(allHalf, noHalf), both);

        // 出力
        System.out.println(result);
        sc.close();
    }
}
