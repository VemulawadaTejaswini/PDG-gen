import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws Exception {
    try (final var stdin = new InputStreamReader(System.in);
         final var br = new BufferedReader(stdin)) {
      final var s = br.readLine();
      int max = 0;

      int startIdx = -1;
      int endIdx = -1;
      for (int i = 0; i < s.length(); i++) {
        if ("ACGT".contains("" + s.charAt(i))) {
          if (startIdx == -1) {
            startIdx = i;
          } else {
            endIdx = i;
          }
        } else {
          if (startIdx != -1 && endIdx != -1) {
            max = Math.max(endIdx - startIdx + 1, max);
          }

          startIdx = -1;
          endIdx = -1;
        }
      }
      if (startIdx != -1 && endIdx != -1) {
        max = Math.max(endIdx - startIdx + 1, max);
      }

      System.out.println(max);
    }
  }
}
