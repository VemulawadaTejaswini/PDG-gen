import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < N; i++) {
      a[i] = sc.nextInt();
    }
    String ans = "second";
    for (int i = 0; i < N; i++) {
      if (a[i] % 2 == 1) {
        ans = "first";
      }
    }
    System.out.println(ans);
  }
}
