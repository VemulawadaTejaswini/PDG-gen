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

    long k = sc.nextLong();

    int l = 0;
    int r = 1;
    List<Integer> splits = new ArrayList<>();
    while (r < s.length()) {
      while (r < s.length() && s.charAt(l) == s.charAt(r)) {
        r++;
      }
      splits.add(r - l);
      l = r;
      r = l + 1;
    }
    if (splits.size() == 1) {
      os.println(splits.get(0) * k / 2);
      return;
    }

    long ans = 0;

    if (s.charAt(0) != s.charAt(s.length() - 1)) {
      long count = 0;
      for (int len : splits) {
        count += len / 2;
      }
      ans = count * k;
    } else {
      long count = 0;
      for (int len : splits) {
        count += len / 2;
      }
      long mCount = 0;
      int last = splits.remove(splits.size() - 1);
      splits.set(0, splits.get(0) + last);
      for (int len : splits) {
        mCount += len / 2;
      }
      ans = count + (k - 1) * mCount;
    }
    os.println(ans);
  }
}