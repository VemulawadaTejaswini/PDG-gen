import java.util.Arrays;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] a = new int[N];
    int[] b = new int[N];
    for(int i = 0; i < N; i++) {
      a[i] = sc.nextInt();
      b[i] = sc.nextInt();
    }
    Arrays.sort(a);
    Arrays.sort(b);
    int ans = a[N-1] + b[0];
    System.out.println(ans);
  }
}
