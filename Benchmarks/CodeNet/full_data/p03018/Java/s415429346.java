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
    int j = 0;
    while (j < n) {

      // for each, find A
      // found A
      if (s.charAt(j) != 'A') {
        j++;
      }

      int aCount = 0;
      int bcCount = 0;
      int i = j;
      while (i < n - 1) {
        if (s.charAt(i) == 'A') {
          aCount++;
          i++;
        } else if (s.charAt(i) == 'B' && s.charAt(i + 1) == 'C') {
          bcCount++;
          i += 2;
          sum += aCount;
        } else {
          break;
        }
      }
      j = i;
    }
    return sum;
  }

//  private static int search(String s) {
//
//    int n = s.length();
//
//    int sum = 0;
//    for (int j = 0; j < n; j++) {
//
//      // for each, find A
//      // found A
//      if (s.charAt(j) != 'A') continue;
//
//      int bcCount = 0;
//      int i = j + 1;
//      while (i < n - 1) {
//        if (s.charAt(i) == 'A') {
//          i++;
//        } else if (s.charAt(i) == 'B' && s.charAt(i + 1) == 'C') {
//          bcCount++;
//          i += 2;
//        } else {
//          break;
//        }
//      }
//      sum += bcCount;
//    }
//    return sum;
//  }
}