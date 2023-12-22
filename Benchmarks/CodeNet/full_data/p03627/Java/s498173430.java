import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    List<Integer> dups = new ArrayList<>();
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < N; i++) {
      int a = scanner.nextInt();
      if (set.contains(a)) {
        dups.add(a);
        set.remove(a);
      } else {
        set.add(a);
      }
    }
    Collections.sort(dups);
    Collections.reverse(dups);

    if (dups.size() < 2) {
      System.out.println(0);
    } else {
      System.out.println(dups.get(0) * dups.get(1));
    }
  }
}
