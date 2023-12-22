import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] u = new int[n - 1];
        int[] v = new int[n - 1];
        int[] w = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            u[i] = Integer.parseInt(sc.next());
            v[i] = Integer.parseInt(sc.next());
            w[i] = Integer.parseInt(sc.next());
        }

        // 主処理
        Map<Integer, HashMap<Integer, Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(i, new HashMap<>());
        }
        for (int i = 0; i < n - 1; i++) {
            map.get(u[i] - 1).put(v[i] - 1, w[i]);
        }

        // 探索の開始地点を設定
        Deque<Integer> todo = new ArrayDeque<>();
        int start = u[0];
        todo.add(start);

        // 探索距離
        int[] distance = new int[n];
        distance[start]++;

        // 色の情報
        int[] color = new int[n];

        // 探索を開始
        while (!todo.isEmpty()) {
            int point = todo.poll();
            for (int nextPoint : map.get(point).keySet()) {
                if (distance[nextPoint] == 0) {
                    todo.add(nextPoint);
                    distance[nextPoint] = distance[point] + map.get(point).get(nextPoint);
                    if (distance[nextPoint] % 2 == 0) {
                        color[nextPoint] = 1;
                    }
                }
            }
        }

        // 出力
        for (int i = 0; i < color.length; i++) {
            System.out.println(color[i]);
        }
        sc.close();
    }
}
