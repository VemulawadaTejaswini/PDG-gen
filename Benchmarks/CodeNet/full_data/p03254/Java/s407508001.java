import java.util.*;

public class Main {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int x = sc.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < N; i++) {
      a[i] = sc.nextInt();
    }
    Arrays.sort(a);

    int cnt = 0;
    while (cnt < a.length) {
      if (x >= a[cnt]) {
        x -= a[cnt];
        cnt++;
      } else {
        break;
      }
    }
    System.out.println(cnt);
  }
}
