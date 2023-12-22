import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int q = Integer.parseInt(sc.next());
        List<Integer[]> edgeList = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            edgeList.add(new Integer[] { a, b });
        }
        long[] count = new long[n + 1];
        for (int i = 0; i < q; i++) {
            int p = Integer.parseInt(sc.next());
            long x = Integer.parseInt(sc.next());
            count[p] += x;
        }
        sc.close();

        // 主処理
        Map<Integer, HashSet<Integer>> graph = createGraph(n, edgeList);
        for (int i = 1; i < count.length; i++) {
            for (int index : graph.get(i)) {
                count[index] += count[i];
            }
        }
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(Long.toString(count[i]));
        }
        String result = String.join(" ", list);

        // 出力
        System.out.println(result);
    }

    public static Map<Integer, HashSet<Integer>> createGraph(int nodeSize, List<Integer[]> edgeList) {
        boolean[] isUsed = new boolean[nodeSize + 1];
        isUsed[1] = true;
        Map<Integer, HashSet<Integer>> graph = new HashMap<>();
        for (int i = 1; i <= nodeSize; i++) {
            graph.put(i, new HashSet<>());
        }
        for (Integer[] edge : edgeList) {
            if (isUsed[edge[0]]) {
                graph.get(edge[0]).add(edge[1]);
            } else {
                graph.get(edge[1]).add(edge[0]);
            }
            isUsed[edge[1]] = true;
        }
        return graph;
    }
}
