import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int k = Integer.parseInt(sc.next());
    int[] a = new int[n];
    for(int i = 0; i < n; i++) a[i] = Integer.parseInt(sc.next());
    long ans = (long)Math.ceil((double)(n - 1) / (k - 1));
    System.out.println(ans);
  }
}
