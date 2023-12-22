import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<List<Integer>> edge = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            edge.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;
            edge.get(a).add(b);
            edge.get(b).add(a);
        }
        List<Integer> path = new ArrayList<>();
        boolean[] visited = new boolean[n];
        int node = 0;
        loop: while (true) {
            visited[node] = true;
            path.add(0, node);
            for (int i : edge.get(node)) {
                if (!visited[i]) {
                    node = i;
                    continue loop;
                }
            }
            break;
        }
        node = 0;
        loop: while (true) {
            visited[node] = true;
            if (node != 0) {
                path.add(node);
            }
            for (int i : edge.get(node)) {
                if (!visited[i]) {
                    node = i;
                    continue loop;
                }
            }
            break;
        }
        System.out.println(path.size());
        for (int i : path) {
            System.out.println(i + 1);
        }
    }
}