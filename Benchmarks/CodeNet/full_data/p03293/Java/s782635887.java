import java.util.*;
import java.util.Collections;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String A = sc.next();
    String ans = "No";
    for (int i = 0; i < S.length(); i++) {
      if (S.equals(A)) {
        ans = "Yes";
        break;
      } else {
        S = S.substring(1, A.length()) + S.substring(0, 1);
      }
    }
    System.out.println(ans);

  }
}
