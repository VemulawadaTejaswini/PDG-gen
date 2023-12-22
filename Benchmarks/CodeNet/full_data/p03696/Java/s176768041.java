import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s = sc.next();
        sc.close();

        // 主処理
        int left = 0;
        int right = 0;
        String replaced = s;
        while (replaced.contains("()")) {
            replaced = replaced.replace("()", "");
        }

        String[] brackets = replaced.replace(")(", "),(").split(",");
        for (String b : brackets) {
            int countLeft = b.replaceAll("[^(]", "").length();
            int countRight = b.replaceAll("[^)]", "").length();
            int diff = countLeft - countRight;

            if (0 < diff) {
                right += diff;
            } else if (diff < 0) {
                left -= diff;
            }
        }

        String result = "(".repeat(left) + s + ")".repeat(right);

        // 出力
        System.out.println(result);
    }
}
