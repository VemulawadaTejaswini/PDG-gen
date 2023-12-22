import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] a = new int[N];
    int x = 0, y = 0, gap;
    int sum = 0;
    int min = 1000000000;
    for(int i = 0; i < N; i++) {
      a[i] = sc.nextInt();
      sum += a[i];
    }
    for(int i = 0; i < N - 1; i++) {
      x += a[i];
      y = sum - x;
      gap = Math.abs(x - y);
      if(min > gap) {
        min = gap;
      }
    }
    System.out.println(min);
  }
}
