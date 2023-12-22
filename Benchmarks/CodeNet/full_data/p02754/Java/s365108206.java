import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.Math;

public class Main {
  static long mod = 1000000007;

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    long N = scan.nextInt();
    long A = scan.nextInt();
    long B = scan.nextInt();
    scan.close();

    long count = N / (A + B);
    long amari = N % (A + B);

    System.out.println(A * count + (A>=amari ? amari : A));
  }
}