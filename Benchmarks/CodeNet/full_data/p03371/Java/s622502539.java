import java.util.Scanner;
import java.util.Arrays;

public class Main { 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int X = sc.nextInt();
    int Y = sc.nextInt();
    if (C >= (A + B)/ 2) {
      System.out.println(X * A + Y * B);
    } else if (C <= Math.max(A,B)/2) {
      System.out.println(Math.max(X,Y) * C * 2);
    } else if (X >= Y) {
      System.out.println((X - Y) * A + Y * C * 2);
    } else {
      System.out.println((Y - X) * B + X * C * 2);
    }
  }
}