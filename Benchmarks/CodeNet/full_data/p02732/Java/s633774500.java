
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] a = new int[n];
    Map<Integer, Long> counter = new HashMap<>();
    long sum = 0;

    for (int i = 0; i < n; i++) {
      a[i] = scanner.nextInt();
      if (counter.containsKey(a[i])) {
        counter.put(a[i], counter.get(a[i]) + 1);
      } else {
        counter.put(a[i], (long) 1);
      }
    }

    for (final Entry<Integer, Long> entry : counter.entrySet()) {
      if (entry.getValue() > 1) {
        sum += entry.getValue() * (entry.getValue() - 1) / 2;
      }
    }

    for (int i = 0; i < n; i++) {
      long count = counter.get(a[i]);
      if (count == 1) {
        System.out.println(sum);
      } else {
        System.out.println(sum - (count * (count - 1) / 2) + ((count - 1) * (count - 2) / 2));
      }
    }
  }
}
