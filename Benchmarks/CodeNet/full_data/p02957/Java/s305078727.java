import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number_a = Integer.parseInt(sc.next());
    int number_b = Integer.parseInt(sc.next());
    if((number_a + number_b) % 2 == 1) {
      System.out.println("IMPOSSIBLE");
    } else {
      System.out.println((number_a + number_b) / 2);
    }
  }
}
