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

    /* logic */
    String candidate0 = generateCandidate(true, s.length());
    String candidate1 = generateCandidate(false, s.length());

    int diffOfCandidate0 = calcDiff(s, candidate0);
    int diffOfCandidate1 = calcDiff(s, candidate1);

    os.println(Math.min(diffOfCandidate0, diffOfCandidate1));
  }

  private static String generateCandidate(boolean initialZero, int length) {
    String candidate = "";
    boolean isZero = initialZero;
    for (int i = 0; i < length; i++) {
      if (isZero) {
        candidate += "0";
      } else {
        candidate += "1";
      }
      isZero = !isZero;
    }
    return candidate;
  }

  private static int calcDiff(String s1, String s2) {

    int diff = 0;
    for (int i = 0; i < s1.length(); i++) {
      if (s1.charAt(i) != s2.charAt(i)) {
        diff++;
      }
    }

    return diff;

  }

}