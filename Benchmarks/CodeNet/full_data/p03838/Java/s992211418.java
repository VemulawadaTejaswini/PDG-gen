import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int A = Math.abs(Math.abs(x)-Math.abs(y));
    int B = 0;
    if (x <= y) {
      B = (long)x*y >= 0 ? 0 : 1;
    } else {
      B = (long)x*y > 0 ? 2 : 1;
    }
    System.out.println(A+B);
  }
}