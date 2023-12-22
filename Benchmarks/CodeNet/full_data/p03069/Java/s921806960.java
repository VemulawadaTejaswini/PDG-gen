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
    int n = sc.nextInt();
    String s = sc.next();
    boolean[] b = new boolean[n];

    for (int i = 0 ; i < n; i++) {
      if (s.charAt(i) == '#') { // black
        b[i] = false;
      } else { // white
        b[i] = true;
      }
    }

    /* logic */
    int i = 0; // find first false
    while (i < n && b[i]) {
      i++;
    }
    // find last of the first continuous false
    while (i < n && !b[i]) {
      i++;
    }

    // find true count;
    int countTrue = 0;
    while (i < n) {
      if (b[i]) {
        countTrue++;
      }
      i++;
    }
    
    int countFalse = 0;
    for (i = 0; i < n; i++) {
      if (!b[i]) {
        countFalse++;
      }
    }
    os.println(Math.min(countTrue, countFalse));
  }
}