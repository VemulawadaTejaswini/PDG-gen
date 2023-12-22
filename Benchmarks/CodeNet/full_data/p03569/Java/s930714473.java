import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        // 主処理
        int result = 0;
        String[] array = s.split("");
        for (int i = 0; i < array.length; i++) {
            if ("U".equals(array[i])) {
                result += i * 2;
                result += array.length - i - 1;
            } else if ("D".equals(array[i])) {
                result += (array.length - i - 1) * 2;
                result += i;
            }
        }

        // 出力
        System.out.println(result);
        sc.close();
    }
}
