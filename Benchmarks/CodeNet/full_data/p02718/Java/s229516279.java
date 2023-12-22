import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) A[i] = sc.nextInt();
    sc.close();

    long sum = 0;
    for (int i = 0; i < N; i++) sum += A[i];

    long cnt = 0;
    for (int i = 0; i < N; i++)
      if (sum <= A[i] * 4 * M ) cnt++;

    String ans = M <= cnt ? "Yes" : "No";
    System.out.println(ans);
  }
}