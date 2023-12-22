import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ##### 初期読み込み #######################################################################
        // 1行 数字 1文字 ---------------------------------------------------------------------------
        long x = Long.parseLong(scanner.nextLine());

        // ##### メイン処理 #######################################################################

        long m = x % 500;
        long n = m % 5;

        long ureshisa = (x - m) / 500 * 1000 + (m - n) / 5 * 5;

        System.out.println(ureshisa);
    }
}