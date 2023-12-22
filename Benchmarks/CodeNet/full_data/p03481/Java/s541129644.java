import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    long x = sc.nextLong();
    long y = sc.nextLong();
    long ans = 1;

    while (true) {
      if ((x * (long) Math.pow(2, ans - 1)) > (y / 2)) {
        System.out.println(ans);
        return;
      }
      ans++;
    }

  }
}