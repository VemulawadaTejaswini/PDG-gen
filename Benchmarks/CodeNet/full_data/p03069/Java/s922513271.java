import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s = sc.next();
        sc.close();

        // 主処理
        int result = solve(n, s);

        // 出力
        System.out.println(result);
    }

    private static int solve(int n, String s) {
        if (!s.contains(".") || !s.contains("#")) {
            return 0;
        }
        int black = s.replaceAll("[^#]", "").length();
        int white = s.replaceAll("[^.]", "").length();
        int countReplace = Math.min(black, white);

        int[] countBlack = new int[n];
        int[] countWhite = new int[n];
        char[] c = s.toCharArray();
        int cb = 0;
        int cw = 0;
        for (int i = 0; i < n; i++) {
            if (c[i] == '#') {
                cb++;
            }
            countBlack[i] = cb;
            if (c[n - 1 - i] == '.') {
                cw++;
            }
            countWhite[i] = cw;
        }
        int count = n;
        for (int i = 0; i < n - 1; i++) {
            count = Math.min(count, countBlack[i] + countWhite[i + 1]);
        }

        return Math.min(countReplace, count);
    }
}
