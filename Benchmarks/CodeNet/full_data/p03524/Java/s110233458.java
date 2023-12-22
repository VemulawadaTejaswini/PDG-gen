import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int a = 0;
    int b = 0;
    int c = 0;
    for (int i = 0; i < S.length(); i++) {
      char x = S.charAt(i);
      if (x == a) a++;
      if (x == b) b++;
      if (x == c) c++;
    }
    if ((a == b && b == c)
        || (a+1 == b && b == c)
        || (a-1 == b && b == c)
        || (a == c && b+1 == c)
        || (a == c && b-1 == c)
        || (a == b && b == c+1)
        || (a == b && b == c-1)) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    } 
  }
}