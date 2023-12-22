import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long x = sc.nextLong();

    long count = (b / x) - (a / x);

    if (a % x == 0) {
      System.out.println(count+1);
    } else {
      System.out.println(count);
    }

  }

}
