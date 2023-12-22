import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws Exception {
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
      int answer = accept(reader.readLine());
      System.out.println(answer);
    }
  }

  static int accept(String line) {
    final String[] tokens = line.split(" ");
    final int a = Integer.parseInt(tokens[0]);
    final int b = Integer.parseInt(tokens[1]);
    return eval(a, b);
  }

  static int eval(int a, int b) {
    if (a == b) return a * 2;
    int max = Math.max(a, b);
    return max * 2 - 1;
  }

}
