import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();
    int length = s.length();
    String ans = "No";
    for (int i = 0; i < length - 1; i++) {
      if (s.equals(t)) {
        ans = "Yes";
        break;
      }
      String rotateS = s.substring(length - 1 - i, length) + s.substring(0, length - 1 - i);
      if (rotateS.equals(t)) {
        ans = "Yes";
        break;
      }
    }
    System.out.println(ans);

  }
}