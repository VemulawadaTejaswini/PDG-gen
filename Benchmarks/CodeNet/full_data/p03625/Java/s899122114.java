import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();

    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < N; i++) {
      int a = scanner.nextInt();
      map.put(a, map.getOrDefault(a, 0) + 1);
    }

    List<Integer> edges = map.entrySet()
        .stream()
        .filter(e -> e.getValue() > 1)
        .map(e -> new int[]{e.getKey(), e.getValue()})
        .flatMap(e -> {
          if (e[1] > 3) {
            return Stream.of(new int[]{e[0], 1}, new int[]{e[0], 1});
          }
          return Stream.of(e);
        })
        .map(e -> e[0])
        .sorted()
        .collect(Collectors.toList());

    Collections.reverse(edges);

    if (edges.size() > 1) {
      System.out.println(edges.get(0) * edges.get(1));
    } else {
      System.out.println(0);
    }
  }
}
