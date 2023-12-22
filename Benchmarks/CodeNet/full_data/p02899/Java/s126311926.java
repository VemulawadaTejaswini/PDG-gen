import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    int ans[] = new int[n + 1];
    for (int i = 1; i <= n; i++) {
      int a = Integer.parseInt(sc.next());
      ans[a] = i;
    }
    pw.println(
      Arrays.stream(ans).skip(1)
        .mapToObj(Integer::toString)
        .collect(Collectors.joining(" "))
    );
  }
}
