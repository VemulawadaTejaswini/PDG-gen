import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int oddNum = 0;
    for (int i = 0; i < N; i++) {
      int A = sc.nextInt();
      if (A%2 == 1) {
        oddNum++;
      }
    }
    System.out.println(oddNum%2 == 0 ? "YES" : "NO");
  }
}