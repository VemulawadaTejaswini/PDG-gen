import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int cIdx = -1;
    for (int i = 0; i < N; i++) {
      if (s.charAt(i) == 'C') {
        cIdx = i;
        break;
      }
    }
    if (cIdx == -1) {
      System.out.println("No");
      return;
    }
    for (int i = cIdx; i < N; i++) {
      if (s.charAt(i) == 'F') {
        System.out.println("Yes");
        return;
      }
    }
    System.out.println("No");
  }
}