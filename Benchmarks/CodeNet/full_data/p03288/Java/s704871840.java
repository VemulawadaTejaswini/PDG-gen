import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int r = Integer.parseInt(sc.next());

        // 主処理
        String result = "";
        if (r < 1200) {
            result = "ABC";
        } else if (r < 2800) {
            result = "ARC";
        } else {
            result = "AGC";
        }

        // 出力
        System.out.println(result);
        sc.close();
    }
}
