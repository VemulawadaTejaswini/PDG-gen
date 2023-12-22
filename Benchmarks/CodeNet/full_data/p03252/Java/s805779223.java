import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String up = sc.next();
    String down = sc.next();
    char[][] upMap = new char[up.length()][2];
    boolean ans = true;
    Outer: for (int i = 0; i < up.length() - 1; i++) {
      for (int j = i; j < up.length(); j++) {
        boolean b = up.charAt(i) == up.charAt(j);
        boolean c = down.charAt(i) == down.charAt(j);
        if (b && !c || c && !b) {
          ans = false;
          break Outer;
        }
      }
    }
    System.out.println(ans ? "Yes" : "No");
  }
}
