import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        Integer[] a = new Integer[m];
        Arrays.setAll(a, i -> Integer.parseInt(sc.next()));
        sc.close();

        // 主処理
        // フィボナッチ数列のMOD
        final int MOD = 1000000007;
        long[] array = new long[100001];
        array[1] = 1;
        for (int i = 2; i < array.length; i++) {
            array[i] += (array[i - 1] + array[i - 2]) % MOD;
        }

        long result = 0;
        if (m == 0) { // 壊れいている床がない場合
            result = array[n];

        } else {
            // 連続している階段の段数
            List<Integer> list = new ArrayList<>();
            list.add(a[0]);
            for (int i = 1; i < m; i++) {
                list.add(a[i] - a[i - 1] - 1);
            }
            list.add(n - a[m - 1]);

            // 床が2段連続で壊れていないことを確認
            if (!list.contains(0)) {
                result = 1;
                for (int num : list) {
                    result = result * array[num] % MOD;
                }
            }
        }

        // 出力
        System.out.println(result);
    }
}
