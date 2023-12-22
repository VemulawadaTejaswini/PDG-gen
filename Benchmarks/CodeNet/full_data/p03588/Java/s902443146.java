import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int maxA = -1;
    int maxB = -1;
    for (int i = 0; i < N; i++) {
      int A = sc.nextInt();
      int B = sc.nextInt();
      if (A > maxA) {
        maxA = A;
        maxB = B;
      }
    }
    System.out.println(maxA+maxB);
  }
}