import java.util.Scanner;

public class C_Vacation {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] a = new int[N + 1];
    int[] b = new int[N + 1];
    int[] c = new int[N + 1];
    int cnt = 0;
    while (++cnt <= N) {
      a[cnt] = sc.nextInt();
      b[cnt] = sc.nextInt();
      c[cnt] = sc.nextInt();
    }
    int[] dpA = new int[N + 1];
    int[] dpB = new int[N + 1];
    int[] dpC = new int[N + 1];
    for (int i = 1; i <= N; i++) {
      dpA[i] = Math.max(dpB[i - 1], dpC[i - 1]) + a[i];
      dpB[i] = Math.max(dpC[i - 1], dpA[i - 1]) + b[i];
      dpC[i] = Math.max(dpA[i - 1], dpB[i - 1]) + c[i];
    }

    System.out.println(Math.max(Math.max(dpA[N], dpB[N]), dpC[N]));
  }
}