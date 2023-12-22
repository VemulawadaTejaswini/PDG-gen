import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    M = sc.nextInt();
    int ans = 1;
    for (i = 0;i < M;i ++) {
      ans *= 2;
    }
    ans *= ((N - M) * 100 +  M * 1900);
    System.out.println(ans);
  }
}