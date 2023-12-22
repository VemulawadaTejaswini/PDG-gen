import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    String s = sc.next();

    sc.close();

    if (3200 <= a) {
      System.out.println(s);
    } else {
      System.out.println("red");
    }

  }

}