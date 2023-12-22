import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] a = new int[n];
    int color = 0;
    int free = 0;
    boolean[] app = new boolean[8];

    for (int i = 0; i < n; i++) {

      a[i] = sc.nextInt();

      if (a[i] >= 3200) {
        free++;
        continue;
      }

      for (int j = 0; j < 3200; j += 400) {
        if ((j <= a[i]) && (a[i] < j + 400)) {
          if (app[j / 400] == false) {
            color++;
            app[j / 400] = true;
          }
          break;
        }
      }

    }

    System.out.println(color + " " + (color + free));

  }

}