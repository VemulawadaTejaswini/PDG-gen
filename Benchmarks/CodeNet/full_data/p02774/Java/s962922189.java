import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final int n = scanner.nextInt();
    final int k = scanner.nextInt();
    List<Long> a = new ArrayList<>();
    List<Long> m = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      a.add(scanner.nextLong());
      for (int j = 0; j < a.size()-1; j++) {
        m.add(a.get(j) * a.get(a.size()-1));
      }
    }
    Collections.sort(m);
    System.out.println(m.get(k-1));
  }
}
