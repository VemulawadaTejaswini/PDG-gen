import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) A[i] = sc.nextInt();
    int ans = 0;
    for (int i = 0; i < N; i++) if (A[i] != i + 1) ans++;
    System.out.println((ans <= 2) ? "YES" : "NO");
  }
}