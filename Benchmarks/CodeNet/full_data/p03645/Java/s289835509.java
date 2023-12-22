import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int[] a = new int[m];
        int[] b = new int[m];
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i < m; i++) {
            a[i] = Integer.parseInt(sc.next());
            b[i] = Integer.parseInt(sc.next());
            if (a[i] == 1) {
                set1.add(b[i]);
            }
            if (b[i] == n) {
                set2.add(a[i]);
            }
        }

        // 主処理
        int beforeSize = set1.size() + set2.size();
        set1.addAll(set2);
        boolean judge = set1.size() != beforeSize;

        String result = judge ? "POSSIBLE" : "IMPOSSIBLE";

        // 出力
        System.out.println(result);
        sc.close();
    }
}
