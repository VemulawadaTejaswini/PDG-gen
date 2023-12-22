import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    List<List<Integer>> all = extract(new ArrayList<>(), n);
    List<Integer> p = IntStream.range(0, n)
      .mapToObj(i -> Integer.valueOf(sc.next())).collect(Collectors.toList());
    List<Integer> q = IntStream.range(0, n)
      .mapToObj(i -> Integer.valueOf(sc.next())).collect(Collectors.toList());
    int pIndex = all.indexOf(p) + 1;
    int qIndex = all.indexOf(q) + 1;
    pw.println(Math.abs(pIndex - qIndex));
  }

  static List<List<Integer>> extract(List<Integer> current, int n) {
    Set<Integer> contained = new HashSet<>(current);
    if (current.size() == n) {
      return Arrays.asList(current);
    }
    List<List<Integer>> ans = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      if (contained.contains(i)) {
        continue;
      }
      List<Integer> copy = new ArrayList<>(current);
      copy.add(i);
      ans.addAll(extract(new ArrayList<>(copy), n));
    }
    return ans;
  }
}
