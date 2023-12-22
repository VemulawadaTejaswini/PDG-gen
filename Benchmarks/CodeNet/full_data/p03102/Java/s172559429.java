import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();
    int c = sc.nextInt();
    int[] b = new int[m];
    int ans = 0;

    for (int i = 0; i < m; i++) {
      b[i] = sc.nextInt();
    }

    for (int i = 0; i < n; i++) {
      int sum = 0;
      for (int j = 0; j < m; j++) {
        sum += sc.nextInt() * b[j];
      }
      if (sum > (-1 * c)) {
        ans++;
      }
    }

    System.out.println(ans);

  }
}