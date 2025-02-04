import java.util.Scanner;

public class Main {
  static final double INF = Double.MAX_VALUE / 2;
  static int n;
  static long[] t, a;

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    n = sc.nextInt();
    t = new long[n]; a = new long[n];
    for(int i = 0; i < n; i++){
      t[i] = sc.nextInt();  a[i] = sc.nextInt();
    }

    double tc = t[0], ac = a[0];
    for(int i = 1; i < n; i++){
      long d = binarySearch(t[i], a[i], ac, tc);
      ac += d;
      if(ac % a[i] != 0){
        ac = ((long)(ac / a[i]) + 1) * (double)a[i];
      }
      tc = t[i] * (ac / a[i]);
    }

    long sum = (long)(tc + ac);
    System.out.println(sum);
  }

  private static long binarySearch(double T, double A, double ac, double tc){
    double low = -1L, high = INF;
    while(high - low > 1L){
      double mid = (long)((high + low) / 2L);
      if(f(mid, T, A, ac, tc)){
        high = mid;
      }
      else{
        low = mid;
      }
    }
    return (long)high;
  }

  private static boolean f(double d, double T, double A, double a, double t){
    return T * (a + d) - A * t >= 0.0;
  }
}
