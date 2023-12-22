import java.util.*;
import java.math.*;

public class Main {

  static int min = 10000;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long m = sc.nextLong();

    long x = kaijo(n);
    long y = kaijo(m);

    System.out.println(x+y);



  }

  public static long kaijo (long x) {
    long sum = 0;
    while (x > 0) {
      x--;
      sum += x;
    }
    return sum;
  }

}
