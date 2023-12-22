import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws Exception {
    try (final var stdin = new InputStreamReader(System.in);
         final var br = new BufferedReader(stdin)) {
      br.readLine();
      final var s = br.readLine();
      final char[] c = new char[3];

      int count = 0;
      for (int i = 0; i < 10; i++) {
        c[0] = (char)('0' + i);
        for (int j = 0; j < 10; j++) {
          c[1] = (char)('0' + j);
          for (int k = 0; k < 10; k++) {
            c[2] = (char)('0' + k);

            int idx = 0;
            for (int l = 0; l < s.length(); l++) {
              if (c[idx] == s.charAt(l)) {
                idx++;
              }

              if (idx == 3) break;
            }

            if (idx == 3) {
              count++;
            }
          }
        }
      }

      System.out.println(count);
    }
  }
}
