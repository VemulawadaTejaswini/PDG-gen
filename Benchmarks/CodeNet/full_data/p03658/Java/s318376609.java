import java.util.*;
class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    final int N = sc.nextInt();
    final int K = sc.nextInt();
    int[] l = new int[N];
    for (int i = 0; i < N; i++)
      l[i] = sc.nextInt();
    Arrays.sort(l);

    int result = 0;
    for (int i = N-K; i < N; i++)
      result += l[i];

    System.out.println(result);
  }
}