import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    long K = Long.parseLong(sc.next());
    int[] a = new int[N];
    int[] b = new int[N];
    for (int i = 0; i < N; i++) {
      a[i] = Integer.parseInt(sc.next());
      b[i] = Integer.parseInt(sc.next());
    }
    Arrays.sort(a);
    Arrays.sort(b);
    long length = 0L;
    for (int i = 0; i < N; i++) {
      length += b[i];
      if (K <= length) {
        System.out.println(a[i]);
        return;
      }
    }
  }
}
