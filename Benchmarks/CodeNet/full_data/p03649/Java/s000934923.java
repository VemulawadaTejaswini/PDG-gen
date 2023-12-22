import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long[] a = new long[(int)N];
    long max = 0;
    long sum = 0;
    for(int i = 0; i < (int)N; i++) {
      a[i] = sc.nextLong();
      max = Math.max(max, a[i]);
      sum += a[i];
    }
    if(max < N) {
      System.out.println(0);
    } else {
      System.out.println(sum / N);
    }
  }
}