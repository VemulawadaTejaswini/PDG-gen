import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] a = new int[N];
    int x = 0, y = 0, gap;
    int sum = 0;
    int min = 1000000;
    for(int i = 0; i < N; i++) {
      a[i] = sc.nextInt();
      sum += a[i];
    }

    for(int i = 0; i < N - 1; i++) {
      for(int j = 0; j <= i; j++) {
        x += a[j];
      }
      y = sum - x;
      if(x > y) {
        break;
      }
      gap = Math.abs(x - y);
      if(min > gap) {
        min = gap;
      }
      x = 0;
      y = 0;
    }
    System.out.println(min);
  }
}
