
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int h = scanner.nextInt();
    int w = scanner.nextInt();
    int k = scanner.nextInt();
    int[][] s = new int[h][w];
    double wnum = 0;

    for (int i = 0; i < h; i++) {
      char[] c = scanner.next()
          .toCharArray();
      for (int j = 0; j < w; j++) {
        s[i][j] = Character.getNumericValue(c[j]);
        if (s[i][j] == 1) {
          wnum++;
        }
      }
    }
    int counter = 0;
    while(wnum > k) {
      wnum = Math.ceil(wnum / 2);
      counter++;
    }
    System.out.println(counter);
  }
}
