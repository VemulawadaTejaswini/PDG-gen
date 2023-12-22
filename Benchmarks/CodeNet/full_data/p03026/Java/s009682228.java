import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class Main {

  public static void main(String[] args) {
    solve(System.in, System.out);
  }

  static void solve(InputStream is, PrintStream os) {
    Scanner sc = new Scanner(is);

    /* read */
    int n = sc.nextInt();

    Map<Integer, List<Integer>> tree = new HashMap<>(n);
    Map<Integer, Integer> roots = new HashMap<>(n);
    boolean[] hasEdgeTo = new boolean[n + 1];
    List<Integer> values = new ArrayList<>(n);

    for (int i = 0; i < n - 1; i++){
      int a = sc.nextInt();
      int b = sc.nextInt();
      List<Integer> list = tree.getOrDefault(a, new ArrayList<>());
      list.add(b);
      tree.put(a, list);
      roots.put(b, a);
      hasEdgeTo[b] = true;
    }

    for (int i = 0; i < n; i++) {
      values.add(sc.nextInt());
    }

    Collections.sort(values);
    Collections.reverse(values);

    int start = 1;
    // find start node
    while (start < n && hasEdgeTo[start]) {
      start++;
    }
    PriorityQueue<Integer> queue = new PriorityQueue<>((i1, i2) -> -(
        Integer.compare(tree.containsKey(i1) ? tree.get(i1).size() : 0,
            tree.containsKey(i2) ? tree.get(i2).size() : 0)
        )
    );
    int[] assign = new int[n + 1];
    queue.add(start);
    int count = 0;
    int sum = 0;
    while(!queue.isEmpty()) {
      int root = queue.remove();
      assign[root] = values.get(count++);
      if (roots.containsKey(root)) {
        sum += Math.min(assign[root], assign[roots.get(root)]);
      }
      if (tree.containsKey(root)) {
        queue.addAll(tree.get(root));
      }
    }
    os.println(sum);
    List<String> result = new ArrayList<>(n);
    for (int i = 1; i <= n; i++) {
      result.add(String.valueOf(assign[i]));
    }
    os.println(String.join(" ", result));
  }
}