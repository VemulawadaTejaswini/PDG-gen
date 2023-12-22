import java.util.*;

public class Main {

  static int calc(int a, int b) {
    if(a == b)
      return 1;
    else
      return 0;
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    if(calc(a, b) == 1)
      System.out.println("Yes");
    else
      System.out.println("No");
  }
}
