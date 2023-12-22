import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    long[] cumsum = new long[N + 1];
    for (int i = 1; i <= N; i++) cumsum[i] = cumsum[i - 1] + scanner.nextInt();

    Map<Long, Integer> freq = new HashMap<>();
    freq.put(0L, 1);
    long res = 0;
    for (int i = 1; i <= N; i++) {
      int f = freq.getOrDefault(cumsum[i], 0);
      res += f;
      freq.put(cumsum[i], f + 1);
    }
    System.out.println(res);
  }
}
