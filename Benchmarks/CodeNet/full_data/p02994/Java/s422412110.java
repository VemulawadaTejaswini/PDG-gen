import java.util.*;
import java.util.stream.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);

    int n = sc.nextInt();
    int l = sc.nextInt();

    List<Integer> tastes = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      int taste = l + i - 1;
      tastes.add(taste);
    }

    List<Integer> tasteAbs = tastes
      .stream()
      .map(t -> Math.abs(t))
      .collect(Collectors.toList());

    Integer exclude = Collections.min(tasteAbs);
    Integer excludeIndex = tasteAbs.indexOf(exclude);

    tastes.remove(tastes.get(excludeIndex));

    int sum = tastes.stream().mapToInt(t -> t).sum();

    System.out.println(sum);
  }
}
