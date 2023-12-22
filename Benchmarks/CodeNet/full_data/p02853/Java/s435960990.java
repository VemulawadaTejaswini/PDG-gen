import java.util.Scanner;

public class Main {
// Mainに書き換え！

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());
        int ans = 0;

        if (x == 1) ans += 300000;
        if (x == 2) ans += 200000;
        if (x == 3) ans += 100000;
        if (y == 1) ans += 300000;
        if (y == 2) ans += 200000;
        if (y == 3) ans += 100000;

        if (x == 1 && y == 1) ans += 400000;
        // 出力
        System.out.println(Integer.toString(ans));

    }
}