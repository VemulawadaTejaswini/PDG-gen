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

    int minValue = Integer.MAX_VALUE;
    for(int i = 0; i <= 5000; i++){
      for (int j = 0; j <= 5000; j++) {
        int aPizza = A * i;
        int bPizza = B * j;
        int cPizza = C * Math.max(0, Math.max(X - i, Y - j)) * 2;
        minValue = Math.min(minValue, aPizza + bPizza + cPizza);
      }
    }

    System.out.println(minValue);
 }
}
