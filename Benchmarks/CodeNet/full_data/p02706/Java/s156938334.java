import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();

    long res = 0;
    for (int i = 0; i < m; i++) {
      res += scan.nextInt();
    }

    if (res > n) {
      System.out.println(-1);
    } else {
      System.out.println(n - res);
    }

  }

}
