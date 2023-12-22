import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int W = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();

    sc.close();

    int d = 0;

    if (a < b) {
      d = b - (a + W);      
    } else {
      d = a - (b + W); 
    }

    if (0 < d) {
      System.out.println(d);
    } else {
      System.out.println(0);
    }

  }

}