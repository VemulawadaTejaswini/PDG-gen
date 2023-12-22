import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    new Main().solve();
  }

  public void solve() {

    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int m = input.nextInt();
    int x = input.nextInt();
    int y = input.nextInt();

    int[] citesA = new int[n];
    for (int i = 0; i < citesA.length; i++) {
      citesA[i] = input.nextInt();
    }

    int[] citesB = new int[m];
    for (int i = 0; i < citesB.length; i++) {
      citesB[i] = input.nextInt();
    }

    if (!(y - x >= 1)) {
      System.out.println("War");
      return;
    }

    Arrays.sort(citesA);
    Arrays.sort(citesB);

    int xmax = citesA[n - 1];
    int ymin = citesB[0];

    if (!(ymin - xmax >= 1)) {
      System.out.println("War");
      return;
    }

    System.out.println("No War");
  }
}
