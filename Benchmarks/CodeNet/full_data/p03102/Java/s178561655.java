import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int c = sc.nextInt();

    int res = 0;

    int[] b = new int[m];

    for (int i = 0; i < m; ++i)
      b[i] = sc.nextInt();

    for (int i = 0; i < n; ++i) {
      int sum = c;
      for (int j = 0; j < m; ++j)
        sum += b[j] * sc.nextInt();
      res = (sum > 0) ? res + 1 : res;
    }

    System.out.println(res);
  }
}
