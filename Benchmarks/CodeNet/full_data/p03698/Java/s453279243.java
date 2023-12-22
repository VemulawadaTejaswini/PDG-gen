import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        // 主処理
        Set<String> set = new HashSet<>(Arrays.asList(s.split("")));

        boolean judge = s.length() == set.size();
        String result = judge ? "yes" : "no";

        // 出力
        System.out.println(result);
    }
}
