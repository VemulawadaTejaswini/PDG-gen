import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] B = new int[N];
    for (int i = 0; i < N; i++) {
      B[i] = sc.nextInt() - (i + 1);
    }
    Arrays.sort(B);
    int mid = B[N / 2];
    long ans = 0;
    for (int i = 0; i < N; i++) {
      ans += Math.abs(B[i] - mid);
    }
    System.out.println(ans);
  }
}