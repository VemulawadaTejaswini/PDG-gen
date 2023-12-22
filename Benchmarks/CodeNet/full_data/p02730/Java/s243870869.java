import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();

    boolean flag = false;

    if (kaibun(S) &&
        kaibun(S.substring(0, (S.length()-1)/2)) &&
        kaibun(S.substring((S.length()+3)/2-1, S.length()))) {

      flag = true;
    }

    if (flag) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  }

  private static boolean kaibun(String s) {
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
        return false;
      }
    }

    return true;
  }

}