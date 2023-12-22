import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] d = new int[k];
        for (int i = 0; i < k; i++) {
            d[i] = sc.nextInt();
        }

        int[] ans = solve(n, k, d);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]);
        }
    }

    private static int[] solve(int n, int k, int[] d) {
        Map<Integer, Boolean> canUseNums = new TreeMap<>(Comparator.naturalOrder());
        for (int i = 0; i <= 9; i++) {
            canUseNums.put(i, true);
        }

        // 使える数字だけ抜き出し。
        for (int i = 0; i < k; i++) {
            int t = d[i];
            canUseNums.put(d[i], false);
        }

        int minCost = canUseNums.entrySet().stream().filter(s -> s.getValue()).map(s -> s.getKey())
                .min(Comparator.naturalOrder()).orElse(9);

        // 繰り上げがあるので1の桁から見ていく
        int[] ans = new int[String.valueOf(n).length()];
        Arrays.fill(ans, -1);

        // 配列化して扱いやすくする
        String N = String.valueOf(n);
        int[] origin = new int[N.length()];
        for (int i = 0; i < N.length(); i++) {
            origin[i] = Integer.parseInt(String.valueOf(N.charAt(i)));
        }

        boolean isNextUp = false;
        for (int i = N.length() - 1; i >= 0; i--) {
            int t = origin[i];
            if (isNextUp) {
                t++; // 繰り上げの場合は1加算しておく。
                isNextUp = false;
            }

            // コストを安くしたいので小さい値から見る
            for (Entry<Integer, Boolean> ent : canUseNums.entrySet()) {
                if (!ent.getValue()) {
                    continue;
                }

                if (ent.getKey() >= t) {
                    // 対象以上の数値が出たら格納して抜ける
                    ans[i] = ent.getKey();
                    break;
                }
            }

            // 使える数字が今回の桁を超えない場合は配列に何も埋まらないので最小値を埋める
            if (ans[i] == -1) {
                ans[i] = minCost;

                // 次の位は1つ桁上げする
                isNextUp = true;
            }

        }
        return ans;
    }
}
