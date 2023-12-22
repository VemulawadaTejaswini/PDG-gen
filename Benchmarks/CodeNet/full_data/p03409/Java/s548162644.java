import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();

    int[][] red = new int[N][2];
    int[][] blue = new int[N][2];

    for (int i = 0; i < N; i++) for (int j = 0; j < 2; j++) red[i][j] = scanner.nextInt();
    for (int i = 0; i < N; i++) for (int j = 0; j < 2; j++) blue[i][j] = scanner.nextInt();

    Arrays.sort(red, Comparator.comparingInt(o -> o[1]));
    Arrays.sort(blue, Comparator.comparingInt(o -> o[0]));

    boolean[] paired = new boolean[N];
    int numPairs = 0;

    for (int i = 0; i < N; i++) {
      int[] b = blue[i];
      for (int j = N - 1; j >= 0; j--) {
        if (paired[j]) continue;
        int[] r = red[j];
        if (r[0] < b[0] && r[1] < b[1]) {
          numPairs++;
          paired[j] = true;
          break;
        }
      }
    }

    System.out.println(numPairs);
  }
}
