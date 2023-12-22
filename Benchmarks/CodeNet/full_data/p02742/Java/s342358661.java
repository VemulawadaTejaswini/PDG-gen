import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        long h = Long.parseLong(sc.next());
        long w = Long.parseLong(sc.next());

        // 主処理
        long result = (long) Math.ceil(h * w / 2.0);

        if (h == 1 || w == 1) {
            result = 1;
        }

        // 出力
        System.out.println(result);
        sc.close();
    }
}
