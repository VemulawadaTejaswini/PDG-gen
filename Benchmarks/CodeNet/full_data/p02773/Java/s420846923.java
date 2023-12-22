import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    Map<String, String> used = new HashMap<>();
    Map<String, Integer> count = new HashMap<>();
    int max = 0;
    for (int i = 0; i < n; i++) {
      String vote = sc.next();
      if (used.get(vote) != null) {
        int val = count.get(vote) + 1;
        count.put(vote, val);
        if (val > max) {
          max++;
        }
      } else {
        used.put(vote, "used");
        count.put(vote, 1);
      }
    }

    final int fMax = max;
    count.entrySet()
        .stream()
        .sorted(Map.Entry.comparingByValue())
        .forEach(
            c -> {
              if (c.getValue() == fMax) {
                System.out.println(c.getKey());
              }
            }
        );
  }
}
