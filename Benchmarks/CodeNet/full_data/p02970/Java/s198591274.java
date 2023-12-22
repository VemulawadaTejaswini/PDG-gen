import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int d = sc.nextInt();
    int dtmp = d;
    d++;
    int ans = 1;

    while (true) {
      d += (2 * dtmp) + 1;
      if ((d - dtmp) <= n) {
        ans++;
      } else {
        break;
      }
    }

    System.out.println(ans);

  }
}