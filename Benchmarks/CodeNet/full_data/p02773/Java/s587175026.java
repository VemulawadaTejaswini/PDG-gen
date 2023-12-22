import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    Map<String, AtomicInteger> votes = new HashMap<>();
    int tempMax = 0;
    for (int i = 0; i < n; i++) {
      tempMax = Math.max(
        votes.computeIfAbsent(
          sc.next(), k -> new AtomicInteger(0)
        ).incrementAndGet(), tempMax);
    }
    final int maxVotes = tempMax;
    votes.entrySet().stream()
      .filter(e -> e.getValue().get() == maxVotes)
      .map(Map.Entry::getKey)
      .sorted()
      .forEach(pw::println);
  }
}
