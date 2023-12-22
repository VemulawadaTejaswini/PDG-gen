import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    solve(a, b);
  }

  private static final SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy") {{
    setLenient(false);
  }};

  static void solve(int a, int b) {
    if (!f(b + "." + a + "." + "2018")) {
      return;
    }
    if (a <= b) {
      System.out.println(a);
      return;
    }
    System.out.println(b);
  }

  private static boolean f(String parse) {
    try {

      sdf.parse(parse);
      return true;

    } catch (Exception ignored) {
      return false;
    }

  }
}
