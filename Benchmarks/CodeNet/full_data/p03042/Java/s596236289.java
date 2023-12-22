import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    try {
      Scanner sc = new Scanner(is);
      String s = sc.next();
      int begin = Integer.parseInt(s.substring(0, 2));
      int end = Integer.parseInt(s.substring(2, 4));
      boolean isYYMM = isYYMM(begin, end);
      boolean isMMYY = isYYMM(end, begin);
      if (isYYMM && isMMYY) {
        pw.println("AMBIGUOUS");
        return;
      }
      if (!isYYMM && !isMMYY) {
        pw.println("NA");
        return;
      }
      if (isYYMM) {
        pw.println("YYMM");
        return;
      }
      if (isMMYY) {
        pw.println("MMYY");
        return;
      }
    } catch (RuntimeException e) {
      pw.println("NA");
      return;
    }
  }

  static boolean isYYMM(int yy, int mm) {
    return isYear(yy) && isMonth(mm);
  }

  static boolean isYear(int yy) {
    return yy >= 0;
  }

  static boolean isMonth(int mm) {
    return 1 <= mm && mm <= 12;
  }
}
