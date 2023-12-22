import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String ans = "APPROVED";
    for (int i = 0; i < N; i++) {
      int A = sc.nextInt();
      if (A % 2 == 0 && A % 3 != 0 && A % 5 != 0) ans = "DENIED";
    }
    System.out.println(ans);
  }
}