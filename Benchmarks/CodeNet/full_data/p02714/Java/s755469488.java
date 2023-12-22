
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    long sum = 0;
    int[][] record = new int[n][3];
    List<Integer> R = new ArrayList<>();
    List<Integer> G = new ArrayList<>();
    List<Integer> B = new ArrayList<>();
    String[] s = scanner.next()
        .split("");

    for (int i = n - 1; i >= 0; i--) {
      if (i != n - 1) {
        record[i][0] = record[i + 1][0];
        record[i][1] = record[i + 1][1];
        record[i][2] = record[i + 1][2];
      }
      if (s[i].equals("R")) {
        record[i][0]++;
      } else if (s[i].equals("G")) {
        record[i][1]++;
      } else {
        record[i][2]++;
      }
    }
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (s[i].equals(s[j])) {
          continue;
        }
        int c1 = mapToNum(s[i]);
        int c2 = mapToNum(s[j]);
        int c3 = c1 + c2 == 1 ? 2 : c1 + c2 == 2 ? 1 : 0;
        int dist = j - i;
        sum += record[j][c3];

        if (j + dist < n && mapToNum(s[j + dist]) == c3) {
          sum--;
        }
      }
    }
    System.out.println(sum);
    
//    for (final Integer base : R) {
//      int i = 1;
//      while (base + 2 * i < n) {
//        if ((G.contains(base + i) && B.contains(base + 2* i)) || (B.contains(base + i) && G.contains(
//            base + 2* i))) {
//          sum++;
//        }
//        i++;
//      }
//    }
//    for (final Integer base : G) {
//      int i = 1;
//      while (base + 2 * i < n) {
//        if ((R.contains(base + i) && B.contains(base + 2* i)) || (B.contains(base + i) && R.contains(
//            base + 2* i))) {
//          sum++;
//        }
//        i++;
//      }
//    }
//
//    for (final Integer base : B) {
//      int i = 1;
//      while (base + 2 * i < n) {
//        if ((G.contains(base + i) && R.contains(base + 2* i)) || (R.contains(base + i) && G.contains(
//            base + 2* i))) {
//          sum++;
//        }
//        i++;
//      }
//    }
//    System.out.println(R.size() * G.size() * B.size() - sum);
//
//    for (int i = 0; i < n; i++) {
//      for (int j = i + 1; j < n; j++) {
//        int dist = 0;
//        final String c1 = s[i];
//        final String c2 = s[j];
//        if (!s[i].equals(s[j])) {
//          dist = j - i;
//          sum += Stream.of(s)
//              .skip(j)
//              .filter(e -> !e.equals(c1) && !e.equals(c2))
//              .count();
//          if(j + dist < n && !s[j+dist].equals(c1) && !s[j+dist].equals(c2)) {
//            sum--;
//          }
//        }
//      }
//    }
//    System.out.println(sum);
  }

  private static int mapToNum(final String s) {
    if (s.equals("R")) {
      return 0;
    } else if (s.equals("G")) {
      return 1;
    } else {
      return 2;
    }
  }
}
