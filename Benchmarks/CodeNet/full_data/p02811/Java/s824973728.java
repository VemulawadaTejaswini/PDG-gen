import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count = sc.nextInt();
    int en = sc.nextInt();

    if (500 * count >= en) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
