import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) {

    String[] input = null;
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      input = br.readLine().split("\\s");
    } catch (IOException e) {
      e.printStackTrace();
      System.exit(1);
    }

    int a = Integer.parseInt(input[0]);
    int b = Integer.parseInt(input[1]);

    int max = a + (a - 1);
    max = Math.max(max, a + b);
    max = Math.max(max, b + (b - 1));
    System.out.print(max);
  }

}
