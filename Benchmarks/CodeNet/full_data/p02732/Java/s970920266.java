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
        long[] combination = new long[n + 1];
        long[] diff = new long[n + 1];
        for (int i = 0; i < a.length; i++) {
            combination[i + 1] += calcCombination(count[i + 1], 2);
            int num = a[i];
            diff[i] = calcCombination(count[num], 2) - calcCombination(count[num] - 1, 2);
        }
        long sum = Arrays.stream(combination).sum();
        for (int i = 0; i < a.length; i++) {
            System.out.println(sum - diff[i]);
        }

        // 出力
        sc.close();
    }

    public static long calcCombination(int n, int m) {
        if (n < m || m < 0) {
            return 0;
        }
        long c = 1;
        m = (n - m < m ? n - m : m);
        for (int ns = n - m + 1, ms = 1; ms <= m; ns++, ms++) {
            c *= ns;
            c /= ms;
        }
        return c;
    }
}
