import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        // 主処理
        String[] array = s.split("");
        Set<String> set = new HashSet<>(Arrays.asList(array));

        String result = "";
        if (array.length != set.size() || "zyxwvutsrqponmlkjihgfedcba".equals(s)
                || "abcdefghijklmnopqrstuvwxyz".equals(s)) {
            result = "-1";

        } else {
            String remain = "abcdefghijklmnopqrstuvwxyz";
            for (String a : array) {
                remain = remain.replace(a, "");
            }

            if (0 < remain.length()) {
                result = s + remain.charAt(0);

            } else if (remain.length() == 0) {
                String alphabet = "abcdefghijklmnopqrstuvwxyz";
                for (int i = 0; i < array.length; i++) {
                    if (!array[i].equals(String.valueOf(alphabet.charAt(i)))) {
                        result = result.substring(0, result.length() - 1);
                        result += alphabet.charAt(i);
                        break;
                    } else {
                        result += alphabet.charAt(i);
                    }
                }
            }
        }

        // 出力
        System.out.println(result);
        sc.close();
    }
}
