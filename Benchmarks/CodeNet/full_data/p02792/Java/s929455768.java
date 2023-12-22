import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    int ans = IntStream.range(0, n).map(i -> countB(i + 1, n)).sum();
    pw.println(ans);
  }

  static int countB(int a, int n) {
    String aString = String.valueOf(a);
    int aHead = Integer.parseInt(String.valueOf(aString.charAt(0)));
    int aTail = Integer.parseInt(String.valueOf(aString.charAt(aString.length() - 1)));
    if (aTail == 0) {
      return 0;
    }
    int bCount = 0;
    if (aHead == aTail && aHead <= n) {
      bCount++;
    }
    for (int i = 10; ; i = i * 10) {
      int bBase = aTail * i + aHead;
      if (bBase > n) {
        break;
      }
      int bMax = bBase + i - 10;
      if (bMax <= n) {
        bCount += i / 10;
      } else {
        for (int j = 0; ; j += 10) {
          int bCandidate = bBase + j;
          if (bCandidate <= n) {
            bCount++;
          } else {
            break;
          }
        }
      }
    }
    return bCount;
  }
}
