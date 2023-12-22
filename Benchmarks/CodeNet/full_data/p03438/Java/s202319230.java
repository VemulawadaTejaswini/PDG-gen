import java.util.*;
public class Main {
  public static void main(String...args) {
    final Scanner sc = new Scanner(System.in);
    final int N = sc.nextInt();
    final int[] a = new int[N];
    for(int i = 0; i < N; i++)
      a[i] = sc.nextInt();
    final int[] b = new int[N];
    for(int i = 0; i < N; i++)
      b[i] = sc.nextInt();
    Arrays.sort(a);
    Arrays.sort(b);
    boolean success = true;
    for(int i = 0; i < N; i++)
      success &= a[i] <= b[i];
    System.out.println(success ? "Yes" : "No");
  }
}