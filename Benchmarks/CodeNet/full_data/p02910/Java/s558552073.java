import java.util.*;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    char[] c = str.toCharArray();
    boolean ans = true;

    for (int i = 0 ; i < str.length() ; i++ ) {
      if (i%2 == 0) {
        if (c[i] == 'R' || c[i] == 'U' || c[i] == 'D') {
          ans = true;
        } else {
              ans = false;
            }
          }
        }

    

    if (ans) {
      System.out.println("Yes");
    } else {
    System.out.println("No");
    }
  }
}
