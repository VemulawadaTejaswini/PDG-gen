import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    if (!S.contains("1") || !S.contains("0")) {
      System.out.println(S.length() / 2);
    } else {
      int zero = 0;
      int one = 0;
      for (int i = 0; i < S.length(); i++) {
        if (S.charAt(i) == '0') {
          zero++;
        } else {
          one++;
        }
      }
      System.out.println(Math.min(zero, one));
    }
  }
}