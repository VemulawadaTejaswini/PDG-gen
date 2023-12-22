import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();

    int[] X = new int[M];
    for (int i = 0; i < M; i++) {
      X[i] = sc.nextInt();
    }

    Arrays.sort(X);
    int[] diff = new int[M-1];
    for (int i = 0; i < M-1; i++) {
      diff[i] = X[i+1] - X[i];
    }

    Arrays.sort(diff);
    int ans = 0;
    for (int i = 0; i < diff.length - (N-1); i++) {
      ans += diff[i];
    }

    System.out.println(ans);
  }
}