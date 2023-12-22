import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        // 主処理
        int result = -1;

        // 既に回文か確認
        StringBuffer sb = new StringBuffer(s);
        if (s.equals(sb.reverse().toString())) {
            result = 0;

        } else {
            String word = s.replace("x", "");
            sb = new StringBuffer(word);
            String reverse = sb.reverse().toString();

            if (word.equals(reverse)) {
                result = s.length() - word.length();
            }

            int startIndex = s.indexOf("x");
            int endIndex = s.lastIndexOf("x");
            if (startIndex != endIndex) {
                String strX = s.substring(startIndex, endIndex + 1);
                String separate = strX.replace("x", "");
                sb = new StringBuffer(separate);
                if (0 < separate.length() && separate.equals(sb.reverse().toString())) {
                    String[] arrayX = strX.split(separate);
                    result = arrayX[0].length() - arrayX[1].length();

                }
            }
        }

        // 出力
        System.out.println(result);
        sc.close();
    }
}
