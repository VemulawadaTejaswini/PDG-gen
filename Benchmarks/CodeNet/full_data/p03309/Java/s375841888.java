import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A[] = new int[N];
    int sum = 0;
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
      sum += A[i];
    }
    int s = 0;
    for (int i = 1; i < N; i++) {
      s += i;
    }
    int ave = sum / N;
    int ans = Integer.MAX_VALUE;
    for (int b = 0 - s / N; b <= ave; b++) {
      int sad = 0;
      for (int i = 0; i < N; i++) {
        sad += Math.abs(A[i] - (b + i + 1));
      }
      ans = Math.min(ans, sad);
    }
    System.out.println(ans);
  }
}