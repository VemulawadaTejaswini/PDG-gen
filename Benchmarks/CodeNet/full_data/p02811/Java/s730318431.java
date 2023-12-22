import java.util.*;

public class Main {
  public static void main(final String[] args) {
    final Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    sc.close();

    if(500 * A >= B) {
      System.out.println("Yes");
    } else {
    System.out.println("No");
    }
  }
}