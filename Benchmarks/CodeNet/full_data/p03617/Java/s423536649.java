import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int q = sc.nextInt();
    int h = sc.nextInt();
    int s = sc.nextInt();
    int d = sc.nextInt();
    int n = sc.nextInt();

    int onel = Math.min(Math.min(4 * q, 2 * h), s);
    int twol = Math.min(onel * 2, d);
    if (twol == d) {
      System.out.println((twol * (n / 2)) + (onel * (n % 2)));
    } else {
      System.out.println(onel * n);
    }

  }
}