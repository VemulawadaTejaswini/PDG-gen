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
    int N = sc.nextInt();
    int count = 0;
    int aEnd = 0;
    int bStart = 0;
    int aStartBEnd = 0;
    List<String> strings = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      String s = sc.next();
      strings.add(s);
      
      boolean flag = false;
      for (int j = 0; j < s.length(); j++) {
        if (s.charAt(j) == 'B' && flag) {
          count++;
          flag = false;
        } else if (s.charAt(j) == 'A') {
          flag = true;
        } else {
          flag = false;
        }
      }
      if (s.charAt(0) == 'B') {
        bStart++;
      }
      if (s.charAt(s.length() - 1) == 'A') {
        aEnd++;
      }
      if (s.charAt(0) == 'B' && s.charAt(s.length() - 1) == 'A') {
        aStartBEnd++;
      }
    }
    
    if (aEnd == bStart && aStartBEnd > 0) {
      count += aEnd - 1;
    } else {
      count += Math.min(aEnd, bStart);
    }

    os.println(count);
  }


}