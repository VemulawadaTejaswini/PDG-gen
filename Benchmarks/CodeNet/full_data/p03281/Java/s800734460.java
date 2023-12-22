import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] count = new int[N];
    int ans =0;
    for (int i=1; i<=N; i++) {
      count[i-1] =0;
      for (int j=1; j<=i; j++) {
        if (i % 2 == 1) {
          if (i % j == 0) count[i-1]++;
        }
      }
    }
    for (int i=1; i<=N; i++) {
      if (count[i-1] == 8) ans++;
    }
    System.out.println(ans);
  }
}