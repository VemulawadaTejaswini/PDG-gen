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

    Map<Integer, Set<Integer>> tree = new HashMap<>(n);
    Map<Integer, Integer> roots = new HashMap<>(n);
    List<Integer> values = new ArrayList<>(n);

    for (int i = 0; i < n - 1; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      Set<Integer> set = tree.getOrDefault(a, new HashSet<>());
      set.add(b);
      tree.put(a, set);
      roots.put(b, a);
    }

    for (int i = 0; i < n; i++) {
      values.add(sc.nextInt());
    }

    Collections.sort(values);

    Queue<Integer> assignable = new LinkedList<>();

    // find leaves
    for (int i = 1; i <= n; i++) {
      if (!tree.containsKey(i)) {
        assignable.add(i);
      }
    }

    int[] assigned = new int[n + 1];
    int count = 0;
    int sum = 0;
    while (!assignable.isEmpty()) {
      int assign = assignable.remove();
      assigned[assign] = values.get(count++);
      if (!roots.containsKey(assign)) continue; // found root! done
      int root = roots.get(assign);
      Set<Integer> set = tree.get(root);
      set.remove(assign);

      sum += assigned[assign];

      if (set.isEmpty()) {
        tree.remove(root);
        assignable.add(root);
      }
    }

    os.println(sum);
    List<String> result = new ArrayList<>(n);
    for (int i = 1; i <= n; i++) {
      result.add(String.valueOf(assigned[i]));
    }
    os.println(String.join(" ", result));


//    int start = 1;
//    // find start node
//    while (start < n && hasEdgeTo[start]) {
//      start++;
//    }
//    PriorityQueue<Integer> queue = new PriorityQueue<>((i1, i2) -> -(
//        Integer.compare(tree.containsKey(i1) ? tree.get(i1).size() : 0,
//            tree.containsKey(i2) ? tree.get(i2).size() : 0)
//        )
//    );
//    int[] assign = new int[n + 1];
//    queue.add(start);
//    int count = 0;
//    int sum = 0;
//    while(!queue.isEmpty()) {
//      int root = queue.remove();
//      assign[root] = values.get(count++);
//      if (roots.containsKey(root)) {
//        sum += Math.min(assign[root], assign[roots.get(root)]);
//      }
//      if (tree.containsKey(root)) {
//        queue.addAll(tree.get(root));
//      }
//    }
//    os.println(sum);
//    List<String> result = new ArrayList<>(n);
//    for (int i = 1; i <= n; i++) {
//      result.add(String.valueOf(assign[i]));
//    }
//    os.println(String.join(" ", result));
  }
}