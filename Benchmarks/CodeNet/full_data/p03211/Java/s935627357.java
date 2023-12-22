import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int X = 753;
    int sub = Integer.MAX_VALUE;
    for (int i = 0; i < S.length() - 2; i++) {
      int tmp = Integer.parseInt(S.substring(i, 3 + i));
      int tmpsub = Math.abs(X - tmp);
      if (sub > tmpsub) {
        sub = tmpsub;
      }
    }
    System.out.println(sub);
  }
}