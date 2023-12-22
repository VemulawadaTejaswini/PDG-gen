
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws Exception {
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
      String numbers = reader.readLine();
      System.out.println(eval(numbers));
    }
  }

  public static int eval(String numbers) {
    if (numbers.contains("753")) return 0;
    int ans = -1;
    final int window = 3;
    for (int i = 0, length = numbers.length() - window; i < length; ++i) {
      // variable "x"
      int generated = Integer.parseInt(numbers.substring(i, i + window));
      int d = Math.abs(753 - generated);
      if (ans == -1 || d < ans) {
        ans = d;
      }
    }
    if (ans == -1)
      throw new AssertionError("Unreachable");
    return ans;
  }

}
