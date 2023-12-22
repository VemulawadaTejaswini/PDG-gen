import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    final int MIN = -1000000;
    final int MAX = 1000000;
    Scanner sc = new Scanner(is);
    int k = Integer.parseInt(sc.next());
    int x = Integer.parseInt(sc.next());
    int left = Math.max(MIN, x - k + 1);
    int right = Math.min(MAX, x + k - 1);
    pw.println(IntStream.rangeClosed(left, right).mapToObj(String::valueOf)
      .collect(Collectors.joining(" ")));
  }
}
