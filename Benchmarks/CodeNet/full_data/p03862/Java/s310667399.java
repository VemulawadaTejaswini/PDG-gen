import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int x = sc.nextInt();
    int[] a = new int[N];
    for(int i = 0; i < N; i++) {
      a[i] = sc.nextInt();
    }
    int count = 0;
    for(int i = 1; i < N; i++) {
      if(a[i - 1] + a[i] > x) {
        count += (a[i] + a[i - 1] - x);
        if(a[i - 1] > x) {
          a[i] = 0;
        } else {
          a[i] = x - a[i - 1];
        }
      }
    }
    System.out.println(count);
  }
}