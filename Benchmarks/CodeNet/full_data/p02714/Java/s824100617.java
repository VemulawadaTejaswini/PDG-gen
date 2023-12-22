import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s = sc.next();
        sc.close();

        // 主処理
        int countR = s.replaceAll("[^R]", "").length();
        int countB = s.replaceAll("[^B]", "").length();
        int countG = s.replaceAll("[^G]", "").length();
        int countAll = countR * countB * countG;

        int countDel = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                int k = j + (j - i);
                if (k < n) {
                    char left = s.charAt(i);
                    char center = s.charAt(j);
                    char right = s.charAt(k);
                    if (left != center && center != right && left != right) {
                        countDel++;
                    }
                } else {
                    break;
                }
            }
        }

        int result = countAll - countDel;

        // 出力
        System.out.println(result);
    }
}
