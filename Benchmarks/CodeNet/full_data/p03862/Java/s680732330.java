import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int x = sc.nextInt();
    int[] a = new int[N];
    for (int i =0; i<N; i++) {
      a[i] = sc.nextInt();
    }
    int count =0;
    for (int i =0; i<N-1; i++) {
      if (a[i] + a[i+1] <= x) {
        continue;
      } else {
      count += a[i] + a[i+1] - x;
      a[i+1] = a[i+1] - (a[i] + a[i+1] - x);
      }
    }
    System.out.println(count);
  }
}