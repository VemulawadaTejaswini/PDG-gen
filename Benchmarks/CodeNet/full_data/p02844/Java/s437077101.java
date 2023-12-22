import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s = sc.next();
        sc.close();

        // 主処理
        Set<String> set = new HashSet<>();
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    set.add("" + s.charAt(i) + s.charAt(j) + s.charAt(k));
                }
            }
        }
        int result = set.size();

        // 出力
        System.out.println(result);
    }
}
