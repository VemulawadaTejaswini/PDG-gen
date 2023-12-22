import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int k = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();

    int yen = (Math.min(k, n) * x) + Math.max(n - k, 0) * y;

    System.out.println(yen);

  }
}