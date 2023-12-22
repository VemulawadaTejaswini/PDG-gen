import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Map<Integer, Set<Integer>> tree = new HashMap<>();
        for (int i : IntStream.range(0, N - 1).toArray()) {
            int a = Integer.parseInt(scan.next());
            int b = Integer.parseInt(scan.next());
            Set<Integer> map = tree.getOrDefault(a, new HashSet<>());
            map.add(b);
            tree.put(a, map);
            map = tree.getOrDefault(b, new HashSet<>());
            map.add(a);
            tree.put(b, map);
        }

        int blackCount = bfs(tree, N);
        if (blackCount > 0) {
            System.out.println("Fennec");
        } else {
            System.out.println("Snuke");
        }

    }

    static int bfs(Map<Integer, Set<Integer>> tree, int N) {
        int[] nodes = new int[N+1];
        nodes[1] = 1;
        nodes[N] = -1;
        LinkedList<List<Integer>> deque = new LinkedList<>();
        deque.addFirst(Arrays.asList(1, 1));
        deque.addFirst(Arrays.asList(N, -1));
        while (!deque.isEmpty()) {
            List<Integer> node = deque.removeLast();
            for (int next : tree.get(node.get(0))) {
                if(nodes[next] != 0) {
                    continue;
                }
                nodes[next] = node.get(1);
                deque.addFirst(Arrays.asList(next, node.get(1)));
            }
        }
        return Arrays.stream(nodes).sum();
    }

}
