import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < N; i++) {
      int tmp = sc.nextInt();
      if (map.containsKey(tmp)) {
        map.put(tmp, map.get(tmp) + 1);
      } else {
        map.put(tmp, 1);
      }
    }
    ArrayList<Integer> list = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();
    Set keys = map.keySet();
    for (Object key : keys) {
      if (map.get(key) >= 2) {
        list.add((Integer)key);
      }
      if (map.get(key) >= 4) {
        list2.add((Integer)key);
      }
    }
    Collections.sort(list);
    Collections.sort(list2);
    int size = list.size();
    int size2 = list2.size();
    if (size >= 2 && size2 >= 1) {
      System.out.println(Integer.max(list.get(size - 1) * list.get(size - 2), list2.get(size2 - 1) * list2.get(size2 - 1)));
    } else if (size >= 2 && size2 == 0) {
      System.out.println(list.get(size - 1) * list.get(size - 2));
    } else if (size == 0) {
      System.out.println(0);
    }
  }
}