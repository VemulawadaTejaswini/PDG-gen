import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

  public static void main(String[] args) {
    solve(System.in, System.out);
  }

  static void solve(InputStream is, PrintStream os) {
    Scanner sc = new Scanner(is);

    /* read */
    String s = sc.next();

    os.println(search(s));

  }

  private static int search(String s) {

    int n = s.length();

    int sum = 0;
    for (int j = 0; j < n; j++) {

      // for each, find A
      // found A
      if (s.charAt(j) != 'A') continue;

      int bcCount = 0;
      int i = j + 1;
      while (i < n - 1) {
        if (s.charAt(i) == 'A') {
          i++;
        } else if (s.charAt(i) == 'B' && s.charAt(i + 1) == 'C') {
          bcCount++;
          i += 2;
        } else {
          break;
        }
      }
      sum += bcCount;
    }
    return sum;
  }

//  private static Map<String, Integer> memo = new HashMap<>();
//
//  private static int dfs(String s) {
//    if (memo.containsKey(s)) return memo.get(s);
//
//    int i = 0;
//    i = s.indexOf("ABC", i);
//    int max = 0;
//    while (i >= 0) {
//      max = Math.max(max, dfs(s.substring(0, i) + "BCA" + s.substring(i + 3)) + 1);
//      i = s.indexOf("ABC", i + 1);
//    }
//    memo.put(s, max);
//    return max;
//  }
}