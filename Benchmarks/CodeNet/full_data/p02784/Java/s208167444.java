import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int N = sc.nextInt();
    int[] A = new int[N+1];
    int total =0;
    for (int i=1; i<=N; i++) {
      A[i] = sc.nextInt();
      total += A[i];
    }
    if (total >= H) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
    