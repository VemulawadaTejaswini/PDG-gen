import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        int[] count = new int[n + 1];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
            count[a[i]]++;
        }

        // 主処理
        for (int i = 0; i < a.length; i++) { // i番目を抜いたとき
            count[a[i]]--;
            int[] target = Arrays.stream(count).filter(c -> 1 < c).toArray();

            long result = 0;
            for (int c : target) {
                result += calcCombination(c, 2);
            }
            System.out.println(result);
            count[a[i]]++;
        }

        // 出力
        sc.close();
    }

    public static long calcCombination(int n, int m) {
        long c = 1;
        m = (n - m < m ? n - m : m);
        for (int ns = n - m + 1, ms = 1; ms <= m; ns++, ms++) {
            c *= ns;
            c /= ms;
        }
        return c;
    }
}
