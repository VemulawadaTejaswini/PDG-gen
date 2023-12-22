import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class Main {

  public static void main(String[] args) {
    solve(System.in, System.out);
  }

  static void solve(InputStream is, PrintStream os) {
    Scanner sc = new Scanner(is);

    /* read */
    String s = sc.next();
    String t = sc.next();

    Set<Character> fixed = new HashSet<>();

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) != t.charAt(i)) {
        if (fixed.contains(t.charAt(i))) {
          os.println("No");
          return;
        }
        char sch = s.charAt(i);
        char tch = t.charAt(i);

        s = s.replace(sch, '*');
        s = s.replace(tch, sch);
        s = s.replace('*', tch);
      }
      fixed.add(t.charAt(i));
    }
    
    os.println("Yes");
  }
}
