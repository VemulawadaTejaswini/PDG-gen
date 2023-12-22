import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      String S = in.next();
      String T = in.next();
      char[] mapping = new char[26];
      Arrays.fill(mapping, ' ');

      boolean canTransform = true;
      for (int i = 0 ; i < T.length(); ++i) {
        if (mapping[T.charAt(i) - 'a'] == ' ') {
          if(S.charAt(i) != T.charAt(i)) {
            mapping[T.charAt(i) - 'a'] = S.charAt(i);
          }
        } else {
          if (mapping[T.charAt(i) - 'a'] != S.charAt(i)) {
            canTransform = false;
            break;
          }
        }
      }
      
      if (canTransform) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
  }
}