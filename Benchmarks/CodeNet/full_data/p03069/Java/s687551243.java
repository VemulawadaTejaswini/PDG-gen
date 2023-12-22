import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();

    int count = 0;
    boolean isBlack = false;
    for (int i = 0; i < n; i++) {
      char c = s.charAt(i);
      if (c == '#') {
        isBlack = true;
      } else if (isBlack) {
        count++;
        isBlack = false;
      }
    }
    
    System.out.println("" + count);
  }
}