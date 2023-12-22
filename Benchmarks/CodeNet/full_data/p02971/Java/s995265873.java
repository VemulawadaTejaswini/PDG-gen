import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Set<Integer> dscSet = new TreeSet<>(Comparator.reverseOrder());
        for (int i = 0; i < n; i++) {
            dscSet.add(a[i]);
        }

        // 最大値と次に大きい値を取得する。1種類の場合は次の値も最大値となる
        Integer[] s = dscSet.toArray(new Integer[dscSet.size()]);
        int max = s[0];
        int nxt = s.length == 1 ? s[0] : s[1];

        // 規約通りにシミュレーション
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int t = a[i];
            if (t == max) {
                ans[i] = nxt;
            } else {
                ans[i] = max;
            }
        }

        // 出力
        for (int i = 0; i < n; i++) {
            System.out.println(ans[i]);
        }
    }
}

