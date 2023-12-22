import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int[] w = new int[n];

    for (int i = 0; i < n; ++i)
      w[i] = sc.nextInt();

    int minDiff = 100 * n;

    for (int i = 0; i < n - 1; ++i) {
      int s1 = 0, s2 = 0;

      for (int j = 0; j <= i; ++j)
        s1 += w[j];
      for (int j = i + 1; j < n; ++j)
        s2 += w[j];

      int diff = Math.abs(s2 - s1);
      minDiff = (diff < minDiff) ? diff : minDiff;
    }

    System.out.println(minDiff);
  }
}