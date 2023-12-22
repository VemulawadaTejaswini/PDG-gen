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

    Map<Character, Set<Character>> pair = new HashMap<>();
//    char[] trans = new char[128];
//
//    for (char c = 'a'; c <= 'z'; c++) {
//      trans[c] = c;
//    }

    for (int i = 0; i < s.length(); i++) {
      char sch = s.charAt(i);
      char tch = t.charAt(i);
      if (sch != tch) {
        s = s.replace(sch, '*');
        s = s.replace(tch, sch);
        s = s.replace('*', tch);
      }
    }
    if (t.equals(s)) {
      os.println("Yes");
    } else {
      os.println("No");
    }
  }
}
