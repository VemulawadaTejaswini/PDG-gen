import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    Pair[] a = new Pair[N];
    for (int i = 0; i < N; i++) {
      a[i] = new Pair(i + 1, scanner.nextInt());
    }
    Arrays.sort(a, Comparator.comparingInt(pair -> pair.second));

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < N; i++) {
      sb.append(a[i].first).append(' ');
    }
    sb.setLength(sb.length() - 1);
    System.out.println(sb.toString());
  }

  private static class Pair {
    private final int first;
    private final int second;

    private Pair(int first, int second) {
      this.first = first;
      this.second = second;
    }
  }
}
