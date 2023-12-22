import java.util.*;
import java.util.stream.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    Map<String, Integer> map = new HashMap<>();
    for (int i = 0; i < N; i++) {
      String t = sc.next();
      int c = 0;
      if (map.get(t) != null) {
        c = map.get(t);
      }
      map.put(t, ++c);
    }
    Optional<Integer> max = map.values().stream().max(Comparator.naturalOrder());
    map.entrySet().stream()
      .filter(e -> e.getValue().equals(max.get()))
      .map(Map.Entry::getKey)
      .sorted()
      .forEach(System.out::println);
  }
}