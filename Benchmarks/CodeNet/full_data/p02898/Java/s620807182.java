import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    int k = Integer.parseInt(sc.next());
    pw.println(
      IntStream.range(0, n)
        .mapToObj(i -> sc.next())
        .mapToInt(Integer::parseInt)
        .filter(h -> h >= k)
        .count());
  }
}
