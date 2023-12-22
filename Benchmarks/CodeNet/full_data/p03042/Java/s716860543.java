import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    String S = sc.next();

    sc.close();

    int f = Integer.valueOf(S.substring(0, 2));
    int r = Integer.valueOf(S.substring(S.length() - 2));

    if (f <= 12 && r <= 12 && f != 0 && r != 0) {
      System.out.println("AMBIGUOUS");
    } else if (f <= 12 && f != 0) {
      System.out.println("MMYY");
    } else if (r <= 12 && r != 0) {
      System.out.println("YYMM");
    } else {
      System.out.println("NA");
    }
  }

}