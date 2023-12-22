import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] H = new int[N+1];
    for (int i = 1; i <= N; i++) {
      H[i] = sc.nextInt();
    }
    
    int ans = 1;
    for (int i = 2; i <= N; i++) {
      if (H[1] <= H[i] && H[2] <= H[i] && H[i-1] <= H[i]) {
        ans++;
      }
    }
    
    System.out.println(ans);
  }
}