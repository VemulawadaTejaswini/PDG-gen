import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int[] a = new int[m];
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = Integer.parseInt(sc.next());
            b[i] = Integer.parseInt(sc.next());
        }

        // 主処理
        // 空のグラフを作成
        List<HashSet<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new HashSet<>());
        }

        // 有向グラフを設定
        for (int i = 0; i < m; i++) {
            list.get(a[i] - 1).add(b[i] - 1);
        }

        // 探索の開始地点を設定
        Deque<Integer> deque = new ArrayDeque<>();
        int start = 0;
        deque.add(start);

        // 探索距離を保持
        int[] distance = new int[n];
        distance[start]++;

        // 探索を開始
        int goal = 0;
        while (!deque.isEmpty()) {
            int point = deque.poll();

            // 目的地判定
            if (point == n - 1) {
                goal = distance[point] - 1;
                break;
            }

            for (int nextPoint : list.get(point)) {
                if (distance[nextPoint] == 0) {
                    deque.add(nextPoint);
                    distance[nextPoint] = distance[point] + 1;
                }
            }
        }

        String result = 0 < goal && goal < 3 ? "POSSIBLE" : "IMPOSSIBLE";

        // 出力
        System.out.println(result);
        sc.close();
    }
}
