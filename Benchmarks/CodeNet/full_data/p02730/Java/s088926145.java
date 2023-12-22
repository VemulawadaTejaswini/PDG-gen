import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    String head = s.substring(0, s.length() / 2);
    String tail = s.substring(s.length() / 2 + 1);

    if (isKaibun(s) && isKaibun(head) && isKaibun(tail)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }

  private static boolean isKaibun(String s) {
    char[] chars = s.toCharArray();
    for (int i = 0; i < s.length() / 2; i++) {
      if (chars[i] != chars[s.length() - i - 1]) {
        return false;
      }
    }
    return true;
  }
}
