import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    int ans[] = new int[n];
    for (int i = 0; i < n - 1; i++) {
      int b = Integer.parseInt(sc.next());
      ans[b - 1] += 1;
    }
    Arrays.stream(ans).forEach(pw::println);
  }
}
