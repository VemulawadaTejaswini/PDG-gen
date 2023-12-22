import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    List<Integer> a = new ArrayList<>();
    Set<Integer> distinctA = new HashSet<>();
    int n = Integer.parseInt(sc.next());
    for (int i = 0; i < n; i++) {
      Integer an = Integer.valueOf(sc.next());
      a.add(an);
      distinctA.add(an);
    }
    pw.println(
      a.size() == distinctA.size() ? "YES" : "NO"
    );
  }
}
