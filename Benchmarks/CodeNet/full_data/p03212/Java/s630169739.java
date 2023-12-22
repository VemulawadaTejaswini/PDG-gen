import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Main {

  public static void main(String[] args) throws Exception {
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
      System.out.println(count(Integer.parseInt(reader.readLine())));
    }
  }

  public static long count(int max) {
    if (max < 357) return 0L;
    return IntStream.rangeClosed(357, max)
        .parallel()
        .filter(i -> (i & 1) == 1)
        .mapToObj(Integer::toString)
        .filter(i -> test(i))
        .count();
  }

  public static boolean test(String text) {
    boolean has3 = false;
    boolean has5 = false;
    boolean has7 = false;
    for (char c : text.toCharArray()) {
      switch (c) {
        case '3':
          has3 = true;
          break;
        case '5':
          has5 = true;
          break;
        case '7':
          has7 = true;
          break;
        default:
          return false;
      }
    }
    return has3 && has5 && has7;
  }

}
