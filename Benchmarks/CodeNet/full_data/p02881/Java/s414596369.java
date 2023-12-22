import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());

        // 主処理
        long div = (long) Math.sqrt(n);
        while (n % div != 0) {
            div--;
        }
        long result = div + n / div - 2;

        // 出力
        System.out.println(result);
        sc.close();
    }
}
