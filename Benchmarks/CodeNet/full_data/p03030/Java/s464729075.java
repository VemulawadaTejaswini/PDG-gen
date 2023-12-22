import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    TreeMap<String, TreeMap<Integer, Integer>> map = new TreeMap<String, TreeMap<Integer, Integer>>();

    for (int i = 0; i < n; i++) {
      String s = sc.next();
      int p = sc.nextInt();
      int ord = i + 1;
      if (map.containsKey(s)) {
        map.get(s).put(p, ord);
      } else {
        TreeMap<Integer, Integer> maptmp = new TreeMap<Integer, Integer>(Comparator.reverseOrder());
        maptmp.put(p, ord);
        map.put(s, maptmp);
      }
    }

    for (String key : map.keySet()) {
      for (int p : map.get(key).keySet()) {
        System.out.println(map.get(key).get(p));
      }
    }

  }
}