import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int K = sc.nextInt();
    for (int i=A; i<=B; i++) {
      if (i >= A && i <= A + K - 1) {
        System.out.println(i);
        continue;
      }
      if (i >= B - K + 1 && i <= B) {
        System.out.println(i);
        continue;
      }
    }
  }
}