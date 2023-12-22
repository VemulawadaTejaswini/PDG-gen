import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    HashSet<Integer> set = new HashSet<>();
    for (int i = 1; i <= N; i++) set.add(i);

    List<String> list = build(set, "");
    Collections.sort(list);

    StringBuilder p = new StringBuilder();
    for (int i = 0; i < N; i++) p.append(scanner.nextInt());
    StringBuilder q = new StringBuilder();
    for (int i = 0; i < N; i++) q.append(scanner.nextInt());

    System.out.println(Math.abs(list.indexOf(p.toString()) - list.indexOf(q.toString())));
  }

  private static List<String> build(Set<Integer> remaining, String str) {
    if (remaining.isEmpty()) {
      List<String> res = new ArrayList<>();
      res.add(str);
      return res;
    }
    List<String> res = new ArrayList<>();
    for (int n : remaining) {
      Set<Integer> s = new HashSet<>(remaining);
      s.remove(n);
      for (String t : build(s, str)) {
        res.add(t + n);
      }
    }
    return res;
  }
}
