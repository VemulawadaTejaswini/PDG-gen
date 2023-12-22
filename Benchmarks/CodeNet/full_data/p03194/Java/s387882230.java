import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long p = sc.nextLong();
    int ans = 1;
    long _p = (long) Math.sqrt(p);
    for (int i = 1; i <= _p; i++) {
      if (p % Math.pow(i, n) == 0) {
        ans = i;
      }
    }
    System.out.println(ans);
  }

}
