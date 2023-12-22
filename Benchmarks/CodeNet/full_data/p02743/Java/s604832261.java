import java.util.Scanner;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    long a = scan.nextInt();
    long b = scan.nextInt();
    long c = scan.nextInt();
    scan.close();

    if(longSqrt(a) + longSqrt(b) < longSqrt(c)) {
      System.out.println("Yes");
    }
    else {
      System.out.println("No");
    }
  }

  public static long longSqrt(long a) {
    long b = (long)Math.sqrt(a);
    if(b*b > a) {
      b--;
    }
    return b;
  }
}