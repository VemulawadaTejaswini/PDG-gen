import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }

        // 主処理
        // s中のa-zまでの使用回数の最小値を保持
        int[] count = new int[26];
        char c = 'a';
        for (int i = 0; i < 26; i++) {
            String str = String.valueOf((char) (c + i));
            int min = 50;
            for (int j = 0; j < s.length; j++) {
                min = Math.min(min, s[j].length() - s[j].replace(str, "").length());
            }
            count[i] = min;
        }

        // 使用する文字
        String word = "";
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                word += (char) (c + i);
            }
        }

        // 辞書順で最小になるようソート
        String[] array = word.split("");
        Arrays.sort(array);
        String result = String.join("", array);

        // 出力
        System.out.println(result);
        sc.close();
    }
}
