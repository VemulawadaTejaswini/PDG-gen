import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    long[] T = new long[N];

    for (int i = 0; i < N; i++) {
      T[i] = sc.nextLong();
    }

    sc.close();

    long result = T[0];

    for (int i = 1; i < N; i++) {
      result = lcm(result, T[i]);
    }

    System.out.println(result);

  }

  public static long gcd(long x, long y){

    if (x < y) {
      long t = x;
      x = y;
      y = t;
    }

    while (y > 0) {
      long r = x % y;
      x = y;
      y = r;
    }

    return x;
    
  }

  public static long lcm(long x, long y) {

		return x / gcd(x, y) * y;
  
  }

}