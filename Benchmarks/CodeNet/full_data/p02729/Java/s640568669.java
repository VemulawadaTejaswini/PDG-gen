import java.util.*;
public class Main {
  public static void main(String[] ) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int ans = N * (N - 1) + M / 2;
    System.out.println(ans);
  }
}
    