import java.io.InputStream;
import java.util.Scanner;

/**
 * AtCoder Beginner Contest 055<br>
 * B - Training Camp<br>
 * <br>
 * <a href=
 * "https://atcoder.jp/contests/abc055/tasks/abc055_b">AtCoderへのリンク</a><br>
 */
public class Main {

    /**
     * エントリポイント
     */
    public static void main(String[] args) {
        // 入力
        int N = input(System.in);
        // 演算
        long power = proc(N);
        // 出力
        System.out.println(power);
    }

    /**
     * 入力値を取得
     */
    static int input(InputStream in) {
        int result = 0;
        try (Scanner sc = new Scanner(in)) {
            result = sc.nextInt();
        }
        return result;
    }

    /**
     *  演算を行う
     */
    static long proc(int N) {
        long unit = (long)(Math.pow(10, 9)) + 7;
        long power = 1;
        
        for (int i = 1; i <= N; i++) {
            power = power * i % unit;
        }
        return power;
    }
}
