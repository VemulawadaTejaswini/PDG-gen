import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.LongStream;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    Map<String, List<String>> smap = new HashMap<>();

    String[] s = new String[N];
    for (int i = 0; i < N; i++) {
      s[i] = sc.next();
    }

    for (int i = N-1; i >= 0; i--) {
      char[] c = s[i].toCharArray();
      Arrays.sort(c);
      String key = new String(c);
      if (smap.get(key) == null) {
        smap.put(key, new ArrayList<>());
      } else {
        smap.get(key).add(s[i]);
      }
    }
    long count = 0L;
    for (Map.Entry<String, List<String>> entry : smap.entrySet()) {
      count += LongStream.rangeClosed(1, entry.getValue().size()).reduce(0, (x, y) -> x + y);
    }

    System.out.println(count);
  }
}

