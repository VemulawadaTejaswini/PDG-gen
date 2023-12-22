import java.util.*;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    HashMap<String, Integer> map = new HashMap<>();
    while (N-- > 0) {
      String s = sc.next();
      map.put(s, map.getOrDefault(s, 0) + 1);
    }
    Stream<Map.Entry<String, Integer>> s =
        map.entrySet().stream()
            .sorted(
                (a, b) ->
                    b.getValue().equals(a.getValue())
                        ? a.getKey().compareTo(b.getKey())
                        : b.getValue() - a.getValue());
    Iterator<Map.Entry<String, Integer>> it = s.iterator();
    Map.Entry<String, Integer> e0 = it.next();
    int num = e0.getValue();
    System.out.println(e0.getKey());
    while (it.hasNext()) {
      Map.Entry<String, Integer> e1 = it.next();
      if (e1.getValue() != num) break;
      System.out.println(e1.getKey());
    }
  }
}
