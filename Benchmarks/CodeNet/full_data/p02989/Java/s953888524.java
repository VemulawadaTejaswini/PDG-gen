import java.io.InputStream;
import java.io.PrintStream;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    List<Integer> difficulties = IntStream.range(0, n).mapToObj(i -> Integer.valueOf(sc.next()))
      .sorted().collect(Collectors.toList());
    int ans =
      difficulties.get(difficulties.size() / 2) - difficulties.get(difficulties.size() / 2 - 1);
    pw.println(ans);
  }
}
