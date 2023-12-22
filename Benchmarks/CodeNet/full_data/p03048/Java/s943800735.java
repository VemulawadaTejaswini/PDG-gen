import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int R = sc.nextInt();
    int G = sc.nextInt();
    int B = sc.nextInt();
    int N = sc.nextInt();

    int ans = solve(R, G, B, N);

    System.out.println(ans);
  }
  
  private static int solve(int R, int G, int B, int n) {
    int count = 0;
    for (int i = n/R; i >=0; i--) {
      int minusR = n - i*R;
      for (int j = minusR/G; j >= 0; j--) {
        int minusRG = minusR - j*G;
        if (minusRG % B == 0) {
          count++;
        }
      }
    }
    return count;
  }
}  
