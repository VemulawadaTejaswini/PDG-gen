import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String n = sc.next();
    String res = new String("No");
    for (int i = 0; i < 3; i++) {
      int tmp = n.charAt(i) - '0';
      if (tmp == 7) res = new String("Yes");
    }
    System.out.println(res);
    sc.close();
  }
}