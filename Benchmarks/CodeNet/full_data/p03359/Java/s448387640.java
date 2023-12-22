import java.util.*;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int count = 0;

    if (a == b || a < b) {
      count = a;
      System.out.println(count);
    } else {
      count = a-1;
      System.out.println(count);
    }
  }
}
