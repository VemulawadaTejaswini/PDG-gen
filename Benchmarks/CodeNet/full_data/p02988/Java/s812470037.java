import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int n = in.nextInt();
      int[] p = new int[n];

      for (int i = 0; i < p.length; ++i) {
        p[i] = in.nextInt();
      }

      int count = 0;
      for (int i = 1; i < p.length - 1; ++i) {
        int max = Math.max(p[i - 1], Math.max(p[i], p[i + 1]));
        int min = Math.min(p[i - 1], Math.min(p[i], p[i + 1]));

        if (p[i] < max && p[i] > min) {
          ++count;
        }
      }

      System.out.println(count);
    }
  }
}