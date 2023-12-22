import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int n = sc.nextInt();
        int a = sc.nextInt();
        int counter = 0;
        sc.close();
        // 500円玉の使う枚数を確認
        while (n > 499) {
            n -= 500;
            counter++;
        }
        // 1円玉の使う枚数を確認
        while (n > 0) {
            n -= 1;
            counter++;
        }

        if (a >= counter) {
            // 出力
            System.out.println("Yes");
        } else {
            // 出力
            System.out.println("No");
        }
    }
}
