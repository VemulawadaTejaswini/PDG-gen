import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    boolean ans;
    int n = Integer.parseInt(stdIn.next());
    String s = stdIn.next();

    if (n % 2 != 0) {
      ans = false;
    } else {
      String t1 = s.substring(0, n / 2);
      String t2 = s.substring(n / 2, n);
      if (t1.equals(t2)) {
        ans = true;
      } else {
        ans = false;
      }
    }

    if (ans) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
