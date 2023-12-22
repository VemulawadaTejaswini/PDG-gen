import java.util.*;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long k = sc.nextLong();

    if (k <= a) {
      a = a-k ;
      k = 0;
    } else {
      k = k-a ;
      a = 0;
    }

    if (k <= b) {
      b = b-k ;
      k = 0;
    } else {
      k = k-b ;
      b = 0;
    }


      System.out.println(a + " " + b);

  }
}
