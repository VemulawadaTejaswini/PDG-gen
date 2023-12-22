import java.util.*;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = A;
    int sum = 0;
    while (B != 0) {
      sum += B % 10;
      B /= 10;
    }
    if (A % sum == 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
