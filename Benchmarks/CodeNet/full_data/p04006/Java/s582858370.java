import java.util.Scanner;

public class Main {
  static final long INF = Long.MAX_VALUE / 2;
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

    long sum = 0;
    for(int i = 0; i < n; i++){
      long min = INF;
      for(int j = 0; j < n; j++){
        if(i > j){
          min = Math.min(min, a[j] + (long)(i - j) * x);
        }
        else{
          min = Math.min(min, a[j] + (long)(j - i) * x);
        }
      }
      sum += min;
    }

    System.out.println(sum);
  }
}