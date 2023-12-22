import java.util.*;
import java.math.*;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long h = sc.nextLong()/2;


    long count = 1;
    long k = 1;
    while (h > 0) {
      k *= 2;
      count += k;
      h /= 2;
    }

    System.out.println(count);


  }

}
