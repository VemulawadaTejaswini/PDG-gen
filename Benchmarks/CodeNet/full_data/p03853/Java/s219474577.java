import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int H = sc.nextInt();
    int W = sc.nextInt();
    String[][] C = new String[H][W];

    for (int i = 0; i < H; i++) {
      String C_ = sc.next();
      C[i] = C_.split("");
    }

    sc.close();

    int i = 0;
    int j = 0;
    while (i < H) {
      for (int k = 0; k < W; k++) {
        System.out.print(C[i][k]);
      }
      if (j % 2 == 0) {
        j++;
      } else {
        j = 0;
        i++;
      }
      System.out.println("");
    }

  }

}