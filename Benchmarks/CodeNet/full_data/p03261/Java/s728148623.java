import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    Set<String> set = new HashSet<>();
    char last = '0';
    for (int i = 0; i < N; i++) {
      String w = scanner.next();
      if (set.contains(w) || last != w.charAt(0)) {
        System.out.println("No");
        return;
      }
      set.add(w);
      last = w.charAt(w.length() - 1);
    }
    System.out.println("Yes");
  }
}
