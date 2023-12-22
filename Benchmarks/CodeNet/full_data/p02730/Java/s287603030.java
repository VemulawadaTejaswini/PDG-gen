import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();

    if (!isKaibun(s)) {
      System.out.println("No");
      return;
    }

    int middle = (s.length() + 1) / 2;
    if (!isKaibun(s.substring(0, middle - 1)) || !isKaibun(s.substring(middle))) {
      System.out.println("No");
      return;
    }

    System.out.println("Yes");
    return;
  }

  static boolean isKaibun(String s) {
    int h = 0;
    int e = s.length() - 1;

    while (h < e) {
      if (!(s.substring(h, h + 1).equals(s.substring(e, e + 1)))) {
        return false;
      }
      h++;
      e--;
    }

    return true;
  }
}
