import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    Set<Integer> m = new TreeSet<>();

    for (int i = 0; i < n; i++) {
      int a = sc.nextInt();
      m.add(a);
    }

    System.out.println(m.size());
  }
}
