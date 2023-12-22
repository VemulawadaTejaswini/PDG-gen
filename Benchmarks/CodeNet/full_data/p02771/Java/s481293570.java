import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    Integer a = Integer.valueOf(sc.next());
    Integer b = Integer.valueOf(sc.next());
    Integer c = Integer.valueOf(sc.next());
    Set<Integer> set = new HashSet<>();
    set.add(a);
    set.add(b);
    set.add(c);
    if (set.size() == 2) {
      pw.println("Yes");
    } else {
      pw.println("No");
    }
  }
}
