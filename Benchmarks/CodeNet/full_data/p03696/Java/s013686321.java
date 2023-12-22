import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s = sc.next();
        sc.close();

        // 主処理
        String[] brackets = s.replace(")(", "),(").split(",");
        StringBuilder left = new StringBuilder();
        StringBuilder right = new StringBuilder();
        for (String b : brackets) {
            int countLeft = b.replaceAll("[^(]", "").length();
            int countRight = b.replaceAll("[^)]", "").length();
            int diff = countLeft - countRight;

            if (0 < diff) {
                right.append(repeat(')', diff));
            } else if (diff < 0) {
                left.append(repeat('(', diff * -1));
            }
        }

        String result = left.toString() + s + right.toString();

        // 出力
        System.out.println(result);
    }

    private static String repeat(char c, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(c);
        }
        return sb.toString();
    }
}
