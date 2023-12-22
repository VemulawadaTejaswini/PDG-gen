import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();


    if (b % a == 0) {
      System.out.println("1");
    } else {
      int x = b/a + 1 ;
      System.out.println(x);
    }
  }
}
