import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long h = sc.nextLong();
    long w = sc.nextLong();

    long n = h*w % 2;

    if (n == 0) {
      System.out.println(h*w/2);
    } else {
      System.out.println(h*w/2+n);
    }
  }
}
