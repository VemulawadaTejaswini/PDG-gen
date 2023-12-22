import static java.lang.Math.floor;
import static java.lang.Math.pow;
import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    int digit = String.valueOf(x).length();
    int twoDig = (int) (x % pow(10,digit - 2));

    if((int)(x / 100) < twoDig / 5 + 1 || digit <= 2) {
      System.out.println(0);
    } else {
      System.out.println(1);
    }


  }

}