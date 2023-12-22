import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextInt();
    long a = sc.nextInt();
    long b = sc.nextInt();

    long sum = a+b;


    if (n%sum == 0) {
      System.out.println(n/sum*a);
    } else {
      System.out.println(n/sum*a+n-sum);
    }


  }
}
