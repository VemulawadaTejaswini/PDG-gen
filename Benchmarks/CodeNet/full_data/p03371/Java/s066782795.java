import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int X = sc.nextInt();
    int Y = sc.nextInt();

    sc.close(); 

    long sum1 = 0;
    long sum2 = 0;
    long sum3 = 0;
    long sum = 0;

    if (X < Y) {
      sum1 += 2 * X * C;
      sum1 += (Y - X) * B;
    } else {
      sum1 += 2 * Y * C;
      sum1 += (X - Y) * A;
    }

    sum = sum1;

    sum2 = X * A + Y * B;

    sum = Math.min(sum, sum2);

    if (X < Y) {
      sum3 += 2 * Y * C;
    } else {
      sum3 += 2 * X * C;
    }

    System.out.println(Math.min(sum, sum3));
  
  }

}