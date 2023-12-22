import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int n = sc.nextInt();
      Set<String> set = new HashSet<>();
      String prev = null;
      boolean isValid = true;
      for (int i = 0; i < n; i++) {
        String s = sc.next();
        if (!isValid) {
          continue;
        }
        if ((prev != null && !s.startsWith(prev.substring(prev.length() - 1, prev.length())))
            || !set.add(s)) {
          isValid = false;
        }
        prev = s;
      }
      System.out.println(isValid ? "Yes" : "No");
    }
  }
}
