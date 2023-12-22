import java.util.Scanner;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.StringJoiner;
import java.math.BigInteger;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int X = sc.nextInt();
    int Y = sc.nextInt();

    // A * X -> AX yen;
    // B * Y -> BY yen;
    // C * Math.max(X, Y) * 2 -> 2 * C * Math.max(X, Y) yen

    // O(n) -> 5000 * 5000 * 5000 -> 125 * 10^9 (NG)
    // O(n) -> 5000 * 5000 -> 25 * 10^6 (OK)

    long minValue = Integer.MAX_VALUE;
    for(int i = 0; i <= 5000; i++){
      for (int j = 0; j <= 5000; j++) {
        long aPizza = A * i;
        long bPizza = B * j;
        // long cPizza = C * Math.max(0, Math.abs(Math.max(X - i, 0) - Math.max(Y - j, 0))) * 2;
        int remainX = X - i > 0 ? X-i : 0;
        int remainY = Y - j > 0 ? Y-j : 0;
        long cPizza = C * Math.max(remainY, remainX) * 2;
        
        minValue = Math.min(minValue, aPizza + bPizza + cPizza);
        // System.out.println("minValue: " + minValue);
      }
    }

    System.out.println(minValue);
 }
}
