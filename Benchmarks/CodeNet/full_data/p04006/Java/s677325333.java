import java.util.Scanner;

public class Main {
  static final long INF = Long.MAX_VALUE;
  static int n;
  static long x;
  static long[] a;

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    n = sc.nextInt(); x = sc.nextInt();
    a = new long[n];
    for(int i = 0; i < n; i++){
      a[i] = sc.nextInt();
    }

    long sum = 0, d = 0;
    for(int i = 0; i < n; i++){
      long min = INF, dd = 0;
      int minj = -1;
      for(int j = 0; j < n; j++){
        if(i >= j){
          long cost = a[j] + (long)((i - j)) * x;
          if(min > cost){
            min = cost;
            minj = j;
            dd = (long)i - j;
          }
        }
        else{
          long cost = a[j] + (long)((n - j + i)) * x;
          if(min > cost){
            min = cost;
            minj = j;
            dd = (long)n - j + i;
          }
        }
      }
      d = Math.max(d, dd);
      sum += a[minj];
    }

    sum += x * d;

    System.out.println(sum);
  }
}