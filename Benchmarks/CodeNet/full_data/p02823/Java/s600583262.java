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
    long n = sc.nextLong();
    long a = sc.nextLong();

    long b = sc.nextLong();
    
    // make a < b
    if (a > b) {
      long tmp = a;
      a = b;
      b = tmp;
    }
    
    long distance = b - a;
    
    if (distance % 2 == 0) {
      os.println(distance / 2);
      return;
    }
    // a is nearer to the edge than b
    if (a - 1 < n - b) {
      os.println(((a - 1) + (b - 1) + 1) / 2);
    } else {
      os.println(((n - a) + (n - b) + 1) / 2);
    }
  }
}