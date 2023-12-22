import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long k = Long.parseLong(sc.next());
        Integer[] a = new Integer[n];
        Arrays.setAll(a, i -> Integer.parseInt(sc.next()));
        sc.close();

        // 主処理
        long count = 0;
        long count2 = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (a[i] < a[j]) {
                    count++; // 転倒数
                    count2++;
                }
            }
            for (int j = 0; j < n; j++) {
                if (a[i] < a[j]) {
                    count2++; // 2周目の転倒数
                }
            }
        }
        long diff = count2 - count; // 転倒数の増分

        final long MOD = 1000000007;
        long result = 0;
        for (int i = 0; i < k; i++) {
            result += count + diff * i;
            result %= MOD;
        }

        // 出力
        System.out.println(result);
    }
}
