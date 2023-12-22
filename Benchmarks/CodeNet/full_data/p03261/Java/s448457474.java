import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String[] w = new String[n];
        Arrays.setAll(w, i -> sc.next());

        // 主処理
        boolean judge = true;
        Set<String> set = new HashSet<>(Arrays.asList(w));

        if (w.length == set.size()) {
            char lastChar = w[0].charAt(w[0].length() - 1);
            for (int i = 1; i < w.length; i++) {
                char c = w[i].charAt(0);
                if (lastChar != c) {
                    judge = false;
                    break;
                }
                lastChar = w[i].charAt(w[i].length() - 1);
            }

        } else {
            judge = false;
        }

        String result = judge ? "Yes" : "No";

        // 出力
        System.out.println(result);
        sc.close();
    }
}
