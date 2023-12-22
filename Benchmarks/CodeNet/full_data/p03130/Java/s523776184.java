import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] nSecs = new int[4];
    for (int i = 0; i < 3; i++) {
      int a = scanner.nextInt() - 1;
      int b = scanner.nextInt() - 1;
      nSecs[a]++;
      nSecs[b]++;
    }

    int numOdds = 0;
    for (int i = 0; i < 4; i++) {
      if (nSecs[i] % 2 == 1) numOdds++;
    }
    if (numOdds == 2) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}
