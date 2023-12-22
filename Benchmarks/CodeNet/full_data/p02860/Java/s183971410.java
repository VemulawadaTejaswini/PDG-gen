import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int n = Integer.parseInt(stdIn.next());
    String s = stdIn.next();

    String s1 = s.substring(0, (n - 1) / 2);
    String s2 = s.substring((n + 1) / 2, n - 1);

    if (n % 2 == 0 && s1.equals(s2)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
