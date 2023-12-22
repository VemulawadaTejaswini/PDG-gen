import java.util.*;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    char c[] = str.toCharArray();
    boolean t = true;

    for (int i = 0 ; i < 3 ; i++ ) {
      if (c[i] == '7') {
        t = true;
        break;
      } else {
        t = false;
        continue;
      }
    }

    if (t == false) {
      System.out.println("No");
    } else {
      System.out.println("Yes");
    }

  }
}
