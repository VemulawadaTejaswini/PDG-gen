import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int H = in.nextInt();
    int W = in.nextInt();

    char[][] inputImage = new char[H][W];
    for (int i = 0; i < H; i++) {
      String tmp = in.next();
      for (int j = 0; j < W; j++) {
        inputImage[i][j] = tmp.charAt(j);
      }
    }

    char[][] outputImage = new char[H * 2][W];
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        outputImage[2 * i][j] = inputImage[i][j];
        outputImage[2 * i + 1][j] = inputImage[i][j];
      }
    }

    for (int i = 0; i < 2 * H; i++) {
      for (int j = 0; j < W; j++) {
        System.out.print(outputImage[i][j]);
      }
      System.out.println("");
    }


  }
}
