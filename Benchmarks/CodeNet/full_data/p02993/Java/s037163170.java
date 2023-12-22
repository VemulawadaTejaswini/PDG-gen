import java.util.Scanner;

/**
 * AtCoder Beginner Contest 131<br>
 * A - Security<br>
 * <br>
 * https://atcoder.jp/contests/abc131/tasks/abc131_a<br>
 */
public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // 標準入力より入力を取得
            String[] input = sc.nextLine().split("");
            // 判定
            Result r = renzokuNum(input);
            // 結果出力
            System.out.println(r.toString());
        }
    }

    /**
     * 番号が連続しているかどうかの判定 
     */
    private static Result renzokuNum(String[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            if (input[i].equals(input[i + 1])) {
                return Result.Bad;
            }
        }
        return Result.Good;
    }

    /**
     * 処理結果 
     */
    enum Result {
        Good("Good"), Bad("Bad"),
        ;

        private String kbn;

        private Result(String kbn) {
            this.kbn = kbn;
        }

        public String toString() {
            return this.kbn;
        }
    }
}