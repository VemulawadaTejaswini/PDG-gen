import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    long x = sc.nextLong();

    sc.close();

    long count = 0;

    if (6 < x) {
      count = (long) Math.ceil(x / 5.5);
    } else {
      count = 1;
    }

    System.out.println(count);
    
  }

}