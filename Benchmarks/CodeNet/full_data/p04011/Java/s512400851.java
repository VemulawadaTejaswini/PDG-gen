import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();

    int a = k * x;
    int b = n - k;
    int c = b * y;

    if(n <= k) {
      System.out.println(n * x);
    }else {
      System.out.println(a+c);
    }
  }
}
