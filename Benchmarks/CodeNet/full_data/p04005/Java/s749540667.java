import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Main {
  static class TinyScanner {
    BufferedReader reader;
    Queue<String> tokens;

    TinyScanner(InputStream istream) {
      if (istream == null) istream = System.in;
      reader = new BufferedReader(new InputStreamReader(istream));
      tokens = new ArrayDeque<>();
      String line;
      try {
        while ((line = reader.readLine()) != null) {
          for (String token: line.split(" ")) {
            tokens.add(token);
          }
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

    boolean hasNext() {
      return !tokens.isEmpty();
    }

    String next() {
      return tokens.remove();
    }

    int nextInt() {
      return Integer.parseInt(next());
    }
  }

  static TinyScanner scn;

  public static void main(String... args) {
    scn = new TinyScanner(System.in);
    int x = scn.nextInt();
    int y = scn.nextInt();
    int z = scn.nextInt();
    if (x % 2 == 0 || x % 2 == 0 || x % 2 == 0) {
      System.out.println(0);
      return;
    }
    int t = Math.max(x, Math.max(y, z));
    if (x == t) {
      System.out.println(y * z);
    } else if (y == t) {
      System.out.println(x * z);
    } else if (z == t) {
      System.out.println(x * y);
    }
  }
}
