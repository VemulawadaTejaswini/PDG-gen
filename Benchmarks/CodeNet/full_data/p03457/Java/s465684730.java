import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();

    int[] t = new int[n + 1];
    int[] x = new int[n + 1];
    int[] y = new int[n + 1];

    t[0] = 0;
    x[0] = 0;
    y[0] = 0;

    for (int i = 1; i < n + 1; i++) {
      t[i] = scan.nextInt();
      x[i] = scan.nextInt();
      y[i] = scan.nextInt();

      if ((Math.abs(x[i] - x[i - 1]) + Math.abs(y[i] - y[i - 1]) > t[i] - t[i - 1])
          || (((Math.abs(x[i] - x[i - 1]) + Math.abs(y[i] - y[i - 1])) % 2) != ((t[i] - t[i - 1]) % 2))) {
        System.out.println("No");
        return;
      }

    }

    System.out.println("Yes");

  }

}
