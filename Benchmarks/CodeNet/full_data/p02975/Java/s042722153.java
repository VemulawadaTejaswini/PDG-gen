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
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }

    Map<Integer, Integer> count = new HashMap<>();

    for (int i = 0; i < n; i++){
      count.put(a[i], count.getOrDefault(a[i], 0) + 1);
    }

    if (count.keySet().size() != 3) {
      os.println("No");
      return;
    }

    Iterator<Integer> it = count.keySet().iterator();
    int first = it.next();
    int second = it.next();
    int third = it.next();
    if (second != xor(first, third)) {
      os.println("No");
      return;
    }

    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    for (int key : count.keySet()) {
      max = Math.max(max, count.get(key));
      min = Math.min(min, count.get(key));
    }

    if (Math.abs(max - min) <= 1) {
      os.println("Yes");
    } else {
      os.println("No");
    }

//    List<Integer> used = new ArrayList<>(n);
//    int first = queue.remove();
//    used.add(first);
//    int second = queue.remove();
//    used.add(second);
//
//    Map<Integer, Integer> count = new HashMap<>();
//    while(!queue.isEmpty()) {
//      int value = queue.remove();
//      count.put(value, count.getOrDefault(value, 0) + 1);
//    }
//
//    List<Integer> list = new LinkedList<>();
//
//    if (helper(count, list)) {
//      os.println("Yes");
//    } else {
//      os.println("No");
//    }
//
//    while(!queue.isEmpty()) {
//      int next = queue.remove();
//      boolean ok = false;
//      int i = 0;
//      while (i < used.size() && !ok) {
//        if (next == xor(used.get(i), used.get((i + 1) % used.size()))) {
//          ok = true;
//        }
//        i++;
//      }
//      if (ok) {
//        used.add((i + 1) % used.size(), next);
//      } else {
//        os.println("No");
//        return;
//      }
//    }
//    for (int i = 0; i < n; i++) {
//      int j = (i + 1) % n;
//      int k = (j + 1) % n;
//      if (used.get(j) != xor(used.get(i), used.get(k))) {
//        os.println("No");
//        return;
//      }
//    }
//    os.println("Yes");
  }

//  private static boolean helper(Map<Integer, Integer> count, List<Integer> list) {
//
//    for (int value : count.keySet()) {
//      if (count.get(value) <= 0) continue;
//
//      for ()
//    }
//    if (!Collections.disjoint(count.keySet(), canGenerate.keySet())) return false;
//
//
//  }

  private static int xor(int a, int b) {
    int res = 0;

    for (int i = 0; i < 32; i++) {
      int mask = 1 << i;
      res += (mask & a) ^ (mask & b);
    }
    return res;
  }
}