import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int check =0;
    for (int i=0; i<S.length(); i++) {
      if (i % 2 == 0) {
        if (S.charAt(i) == 'L') {
        check++;
        break;
        }
      } else {
        if (S.charAt(i) == 'R') {
        check++;
        break;
        }
      }
    }
    if (check != 0) {
      System.out.println("No");
    } else {
      System.out.println("Yes");
    }
  }
}