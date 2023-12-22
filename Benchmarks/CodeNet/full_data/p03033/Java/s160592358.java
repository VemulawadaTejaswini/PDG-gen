import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    SortedSet<Integer> ss = new TreeSet<Integer>();
    SortedMap<Double, int[]> mp = new TreeMap<Double, int[]>();
    int n = sc.nextInt();
    int q = sc.nextInt();
    int[] res = new int[q];
    for (int i = 0; i < n; i++) {
      int s = sc.nextInt(), e = sc.nextInt(), x = sc.nextInt();
      mp.put((double)s - 0.5 - x, new int[]{ 0, x });
      mp.put((double)e - 0.75 - x, new int[]{ 1, x });
    }
    for (int i = 0; i < q; i++) {
      int d = sc.nextInt();
      mp.put((double)d, new int[]{ 2, i });
    }
    for (Map.Entry<Double, int[]> entry : mp.entrySet()) {
      int[] value = entry.getValue();
      if (value[0] == 0) {
        ss.add(value[1]);
      }
      if (value[0] == 1) {
        ss.remove(value[1]);
      }
      if (value[0] == 2) {
        res[value[1]] = ss.size() == 0 ? -1 : ss.first();
      }
    }
    System.out.println(n);
    for (int i : res) {
      System.out.println(i);
    }
  }
}
