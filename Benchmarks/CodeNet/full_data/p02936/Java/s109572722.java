import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    static Map<Integer, Set<Integer>> edge = new HashMap<>();
    static Map<Integer, List<Integer>> p2x = new HashMap<>();
    static boolean[] visited;

    public static void main(String[] args) {
//        System.out.println(Integer.MAX_VALUE);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            // a -> b
            if (!edge.keySet().contains(a)) {
                edge.put(a, new HashSet<>());
            }
            edge.get(a).add(b);
            // b -> a
            if (!edge.keySet().contains(b)) {
                edge.put(b, new HashSet<>());
            }
            edge.get(b).add(a);
        }

        for (int i = 1; i <= q; i++) {
            int p = sc.nextInt();
            int x = sc.nextInt();
            if (!p2x.keySet().contains(p)) {
                p2x.put(p, new ArrayList<>());
            }
            p2x.get(p).add(x);
        }
        sc.close();

        visited = new boolean[n + 1];

        Integer[] counter = new Integer[n];
        for (int i = 0; i < n; i++) {
            counter[i] = 0;
        }

        dfs(1, counter, 0);

        // output result
        String ans = Arrays.asList(counter).stream().map(e -> String.valueOf(e)).collect(Collectors.joining(" "));
        System.out.println(ans);
    }

    static void dfs(int currentNode, Integer[] counter, int diff) {
        // 来訪済みノードは処理しない
        if (visited[currentNode]) {
            return;
        }
        // 来訪済みフラグを建てる
        visited[currentNode] = true;
        // カウンターアップ対象ノードの場合、以降のノードでカウントアップするための変数：diffの値を増加する
        if (p2x.keySet().contains(currentNode)) {
            for (int add : p2x.get(currentNode)) {
                diff += add;
            }
        }
        // カウンターアップ
        counter[currentNode - 1] += diff;
//        System.out.println("currentNode:" + currentNode);
        for (Integer nextNode : edge.get(currentNode)) {
            dfs(nextNode, counter, diff);
        }

    }
}
