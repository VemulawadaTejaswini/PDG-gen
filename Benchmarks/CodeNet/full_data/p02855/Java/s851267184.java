import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    int cakeNum = sc.nextInt();
    int[][] cake = new int[H][W];
    int cakeId = 1;
    for (int i = 0; i < H; i++) {
      String line = sc.next();
      for (int j = 0; j < W; j++) {
        if (line.charAt(j) == '#') cake[i][j] = cakeId++;
      }
    }

    cakeId = 1;
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        if (cake[i][j] == cakeId) {
          findBiggestCake(cake, i, j);
          cakeId++;
        }
      }
    }

    for (int i = 0; i < H; i++) {
      String out = "";
      for (int j = 0; j < W; j++) {
        out += " " + cake[i][j];
      }
      System.out.println(out);
    }
  }

  private static void findBiggestCake(int[][] cake, int i, int j) {
    int cakeId = cake[i][j];
    int hUp = 0, hDown = 0, wLeft = 0, wRight = 0;
    // go up
    while (j+hUp-1 >= 0 && cake[i][j+hUp-1] == 0) hUp--;
    while (j+hDown+1 < cake[0].length && cake[i][j+hDown+1] == 0) hDown++;
    while (i+wLeft-1 >= 0) {
      boolean isOk = true;
      for (int k = hUp; k <= hDown; k++) {
        if (cake[i+wLeft-1][j+k] != 0) isOk = false;
      }
      if (isOk) wLeft--;
      else break;
    }

    while (i+wRight+1 < cake.length) {
      boolean isOk = true;
      for (int k = hUp; k <= hDown; k++) {
        if (cake[i+wRight+1][j+k] != 0) isOk = false;
      }
      if (isOk) wRight++;
      else break;
    }

    for (int m = wLeft; m <= wRight; m++) {
      for (int n = hUp; n <= hDown; n++) {
        cake[m+i][n+j] = cakeId;
      }
    }
  }
}