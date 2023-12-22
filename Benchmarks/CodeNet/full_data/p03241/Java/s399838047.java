import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int max = M / N;
    int ans = 0;
    for (int i = 1; i <= max; i++) {
      if (M % i == 0) {
        ans = i;
      }
    }
    System.out.println(ans);
  }
}