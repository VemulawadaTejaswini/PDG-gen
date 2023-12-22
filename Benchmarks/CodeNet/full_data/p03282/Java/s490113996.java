import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    long k = sc.nextLong();
    int ans = 0;

    if (s.charAt(0) != 1) {
      ans = s.charAt(0);
    } else {

      int not1count = s.length();
      int not1num = 1;

      for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) != 1) {
          not1count = i;
          not1num = s.charAt(i);
        }
      }

      if (k < not1count) {
        ans = 1;
      } else {
        ans = not1num;
      }
    }

    System.out.println(ans);
    sc.close();

  }
}
