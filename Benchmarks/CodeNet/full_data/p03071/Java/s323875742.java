import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.lang.StringBuilder;

public class Main {
  public static void main(String[] args ){

    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    int B = sc.nextInt();

    int coins = 0;
    for(int i = 0; i < 2; i++) {
      if (A > B) {
        coins += A;
        A--;
      } else {
        coins += B;
        B--;
      }
    }

    System.out.println(coins);

  }
}
