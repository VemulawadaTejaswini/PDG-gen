import java.util.Scanner;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    long a = scan.nextLong();
    long b = scan.nextLong();
    long c = scan.nextLong();
    scan.close();

    if(longSqrt(a) + longSqrt(b) < longSqrt(c)) {
      System.out.println("Yes");
    }
    else {
      System.out.println("No");
    }
  }

  public static double longSqrt(long a) {
    double squareRoot = a / 2;

    double g1;
    do {
      g1 = squareRoot;
      squareRoot = (a /g1 + g1) / 2;
    } while((g1-squareRoot) != 0);

    return squareRoot;
  }
}