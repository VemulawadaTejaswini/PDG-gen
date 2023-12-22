
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    int x = scanner.nextInt();

    Set<Integer> results = new LinkedHashSet<>();

    for (int aCount = 0; aCount < a; aCount++) {
      for (int bCount = 0; bCount < b; bCount++) {
        for (int cCount = 0; cCount < c; cCount++) {
          int result = aCount * 500 + bCount * 100 + cCount * 50;

          results.add(result);

        }
      }
    }

    System.out.println(results.size());
    scanner.close();
  }
}
