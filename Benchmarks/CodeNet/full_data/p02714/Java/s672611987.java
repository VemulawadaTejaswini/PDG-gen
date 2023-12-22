
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
    List<Integer> R = new ArrayList<>();
    List<Integer> G = new ArrayList<>();
    List<Integer> B = new ArrayList<>();
    String[] s = scanner.next()
        .split("");

    for (int i = 0; i < n; i++) {
      if (s[i].equals("R")) {
        R.add(i);
      } else if (s[i].equals("G")) {
        G.add(i);
      } else {
        B.add(i);
      }
    }

    for (final Integer base : R) {
      int i = 1;
      while (base + 2 * i < n) {
        if ((G.contains(base + i) && B.contains(base + 2* i)) || (B.contains(base + i) && G.contains(
            base + 2* i))) {
          sum++;
        }
        i++;
      }
    }
    for (final Integer base : G) {
      int i = 1;
      while (base + 2 * i < n) {
        if ((R.contains(base + i) && B.contains(base + 2* i)) || (B.contains(base + i) && R.contains(
            base + 2* i))) {
          sum++;
        }
        i++;
      }
    }

    for (final Integer base : B) {
      int i = 1;
      while (base + 2 * i < n) {
        if ((G.contains(base + i) && R.contains(base + 2* i)) || (R.contains(base + i) && G.contains(
            base + 2* i))) {
          sum++;
        }
        i++;
      }
    }
    System.out.println(R.size() * G.size() * B.size() - sum);
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
}
