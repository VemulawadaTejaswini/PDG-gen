import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        // 主処理
        int countB = s.replace("BW", "").replaceAll("[^B]", "").length();
        int countBW = (s.length() - s.replace("BW", "").length()) / 2;

        int result = 1;
        for (int i = countBW; 0 < i; i--) {
            result *= i;
        }
        result += countB;

        // 出力
        System.out.println(result);
    }
}
