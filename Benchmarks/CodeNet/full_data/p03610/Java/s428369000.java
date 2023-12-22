import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        // 主処理
        String[] array = s.split("");
        String result = "";
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                result += array[i];
            }
        }

        // 出力
        System.out.println(result);
    }
}
