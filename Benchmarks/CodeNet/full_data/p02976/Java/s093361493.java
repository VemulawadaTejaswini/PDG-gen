
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        for (int i = 0; i < m; ++i) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            Set<Integer> nextA = graph.getOrDefault(a, new HashSet<>());
            nextA.add(b);
            Set<Integer> nextB = graph.getOrDefault(b, new HashSet<>());
            nextB.add(a);
            graph.put(a, nextA);
            graph.put(b, nextB);
        }
        if (m % 2 == 1) {
            System.out.println(-1);
            return;
        }
        int[] visited = new int[n + 1];
        Map<Integer, Set<Integer>> spanningTree = new HashMap<>();
        dfs(1, visited, graph, spanningTree);

        makeDirection(n, graph, spanningTree);
        graph.entrySet().forEach(
                keyValue -> {
                    for (int value : keyValue.getValue()) {
                        System.out.println(keyValue.getKey() + " " + value);
                    }
                }
        );

    }

    // find spanning tree
    public static void dfs(
            int current, int[] visited, Map<Integer, Set<Integer>> originalGraph,
            Map<Integer, Set<Integer>> spanningTree
    ) {
        Set<Integer> connecteds = originalGraph.get(current);
        connecteds.stream()
                .filter(
                        index -> visited[index] == 0
                ).forEach(
                        index -> {
                            visited[index] = 1;
                            Set<Integer> connectedInSpanningTree =
                                    spanningTree.getOrDefault(current, new HashSet<>());
                            connectedInSpanningTree.add(index);
                            spanningTree.put(current, connectedInSpanningTree);

                            Set<Integer> connectedIndexs = spanningTree.getOrDefault(index, new HashSet<>());
                            connectedIndexs.add(current);
                            spanningTree.put(
                                    index,
                                    connectedIndexs
                            );
                            dfs(index, visited, originalGraph, spanningTree);
                        }
                );
    }

    public static void makeDirection(
            int n,
            Map<Integer, Set<Integer>> graph,
            Map<Integer, Set<Integer>> tree
    ) {
        int [] outDegrees = new int[n + 1];
        graph.forEach((key, value) -> graph.get(key).removeAll(tree.get(key)));

        // randomly make directions of the edges that are not in spanning tree
        graph.forEach(
                (key, value) -> {
                    for (Integer connected : value) {
                        // keep the edge key -> connected, remove the edge connected -> key
                        graph.get(connected).remove(key);
                        outDegrees[key]++;
                    }
                }
        );

        int [] visited = new int[n + 1];
        Deque<Integer> sortedNodes = new LinkedList<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        visited[1] = 1;
        while (!queue.isEmpty()) {
            int current = queue.poll();
            sortedNodes.add(current);
      //      System.out.println("sortedNodes: " + current);

            Set<Integer> sons = tree.get(current);
            for (int son : sons) {
               if (visited[son] == 0) {
                   queue.add(son);
                   visited[son] = 1;
               }
            }
        }

        while(!sortedNodes.isEmpty()) {
            int current = sortedNodes.pollLast();
         //   System.out.println("current: " + current);
            if (current == 1) {
                break;
            }
            int father = tree.get(current).iterator().next();
        //    System.out.println("father: " + father);
            if (outDegrees[current] % 2 == 0) {
                Set<Integer> fatherConnected = graph.getOrDefault(father, new HashSet<>());
                fatherConnected.add(current);
                graph.put(father, fatherConnected);
                outDegrees[father]++;
           //     System.out.println(father + "-> " + current);
            } else {
                Set<Integer> currentConnected = graph.getOrDefault(current, new HashSet<>());
                currentConnected.add(father);
                graph.put(current, currentConnected);
                outDegrees[current]++;
         //       System.out.println(current + "-> " + father);
            }
            tree.get(current).remove(father);
            tree.get(father).remove(current);
        }

    }
}
