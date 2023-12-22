import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        Integer a = Integer.parseInt(sc.next());
        Integer b = Integer.parseInt(sc.next());
        Integer.parseInt(sc.next()); // 未使用となる変数c

        // 主処理
        int result = a * b / 2;

        // 出力
        System.out.println(result);
        sc.close();
    }
}
