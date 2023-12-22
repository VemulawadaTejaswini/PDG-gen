import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    int[] h = new int[N + 1];
    for(int i = 0; i < N; i++) {
      h[i] = sc.nextInt();
    }
    int left = 1;
    int right = (int)Math.pow(10, 9);
    int ans = (int)Math.pow(10, 9);
    while(left < right) {
      int med = (left + right) / 2;
      long count = 0;
      for(int i = 0; i < N; i++) {
        int r = h[i] - med * B;
        if(r > 0) {
          count += (long)((r + A - B - 1) / (A - B));
        }
      }
      if(count > med) {
        left = med + 1;
      } else {
        ans = med;
        right = med;
      }
    }
    System.out.println(ans);
  }
}