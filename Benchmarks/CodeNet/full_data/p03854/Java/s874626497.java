import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = "1" + sc.next();
    String[] a = {"dream", "dreamer", "erase", "eraser"};

    s = s.replaceAll(a[3], "");
    s = s.replaceAll(a[2], "");
    s = s.replaceAll(a[1], "");
    s = s.replaceAll(a[0], "");

    System.out.println(s.equals("1") ? "YES" : "NO");

  }
}