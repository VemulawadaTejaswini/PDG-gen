import java.util.Scanner;
import java.util.HashMap;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    HashMap<String, Integer> map = new HashMap<>();

    int n = sc.nextInt();

    for (int i = 0; i < n; ++i) {
      String s = sc.next();
      map.put(s, map.getOrDefault(s, 0) + 1);
    }

    int m = sc.nextInt();

    for (int i = 0; i < m; ++i) {
      String t = sc.next();

      map.put(t, map.getOrDefault(t, 0) - 1);
    }

    int max = 0;

    for (int i : map.values()) {
      if (i > max)
        max = i;
    }

    System.out.println(max);
  }
}