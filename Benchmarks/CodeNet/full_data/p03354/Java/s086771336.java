import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 256 * 1024 * 1024).start();
    }

    public void run() {
        int n = sc.nextInt(), m = sc.nextInt();
        int p[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            p[i] = sc.nextInt();
        }
        Map<Integer, List<Integer>> neighbors = new HashMap<>();
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            if (!neighbors.containsKey(a)) {
                neighbors.put(a, new ArrayList<>());
            }
            if (!neighbors.containsKey(b)) {
                neighbors.put(b, new ArrayList<>());
            }
            neighbors.get(a).add(b);
            neighbors.get(b).add(a);
        }

        DFS dfs = new DFS(neighbors);
        int[] links = new int[n + 1];
        int linkId = 1;
        for (int i = 1; i <= n; i++) {
            if (links[i] == 0) {
                dfs.fillId(links, linkId, i);
                linkId++;
            }
        }
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (links[p[i]] == links[i]) {
                count++;
            }
        }
        System.out.println(count);
    }
}

class DFS {

    private Map<Integer, List<Integer>> neighbors;

    DFS(Map<Integer, List<Integer>> neighbors) {
        this.neighbors = neighbors;
    }

    void fillId(int[] links, int linkId, int root) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(root);
        links[root] = linkId;
        while (!stack.isEmpty()) {
            int u = stack.pop();
            if (neighbors.containsKey(u)) {
                for (int i = 0; i < neighbors.get(u).size(); i++) {
                    int v = neighbors.get(u).get(i);
                    if (links[v] == 0) {
                        links[v] = linkId;
                        stack.push(v);
                    }
                }
            }
        }
    }
}
