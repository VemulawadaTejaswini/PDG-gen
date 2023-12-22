import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());

        // 主処理
        int[] abc = new int[] { a, b, c };
        Arrays.sort(abc);

        int result = abc[0] + abc[1] + (abc[2] * 10);

        // 出力
        System.out.println(result);
        sc.close();
    }
}