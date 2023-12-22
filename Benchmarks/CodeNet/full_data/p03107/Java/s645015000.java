import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();

    int removals = 0;

    boolean found;
    do {
      found = false;
      String s1 = s.replace("10", "");
      if (!s1.equals(s)) {
        found = true;
        removals += s.length() - s1.length();
        s = s1;
      }
      s1 = s.replace("01", "");
      if (!s1.equals(s)) {
        found = true;
        removals += s.length() - s1.length();
        s = s1;
      }
    } while (found);

    System.out.println(removals);
  }
}
