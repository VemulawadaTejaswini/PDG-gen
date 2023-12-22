import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws Exception {
    try (final var stdin = new InputStreamReader(System.in);
         final var br = new BufferedReader(stdin)) {
      final var aStr = br.readLine().split(" ")[0];
      final var s = br.readLine().split(" ");
      final var a = Integer.parseInt(s[0]);
      final var b = Integer.parseInt(s[1]);
      final var u = br.readLine();

      if (aStr.equals(u)) {
        System.out.println((a - 1) + " " + b);
      } else {
        System.out.println(a + " " + (b - 1));
      }
    }
  }
}
